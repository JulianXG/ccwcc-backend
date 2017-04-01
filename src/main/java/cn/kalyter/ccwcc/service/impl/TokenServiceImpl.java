/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.*;
import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.TokenService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class TokenServiceImpl implements TokenService {
    private final Logger logger = LoggerFactory.getLogger(TokenServiceImpl.class);
    @Autowired
    private TokenMapper tokenMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Token getToken(User user) {
        Token result = null;
        try {
            Date now = new Date();
            result = new Token();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            ObjectMapper mapper = new ObjectMapper();
            String userJSON = mapper.writeValueAsString(user);
            String code = userJSON + now.getTime();
            byte[] bytes = messageDigest.digest(code.getBytes());
            String md5Result = "";
            for (byte aByte : bytes) {
                String string = Integer.toHexString(aByte & 0xFF);
                if (string.length() == 1) {
                    string += "F";
                }
                md5Result += string;
            }
            result.setToken(md5Result.toUpperCase());
            result.setExpireTime(Constant.DEFAULT_EXPIRE_TIME);
            result.setUserId(user.getId());
            result.setCreateTime(now);
            result.setUpdateTime(now);
            result.setRequestTime(now);
            result.setIsDeleted(false);
            tokenMapper.insertSelective(result);
        } catch (NoSuchAlgorithmException | JsonProcessingException e) {
            logger.error("生成token出错", e);
        }
        return result;
    }

    @Override
    public void clearToken(String token) {
        TokenExample tokenExample = new TokenExample();
        tokenExample.or().andTokenEqualTo(token);
        Token result = tokenMapper.selectByExample(tokenExample).get(0);
        if (result != null) {
            tokenMapper.clearToken(result.getId());
        }
    }

    @Override
    public Token validateToken(String token, String requestURL) {
        token = (token == null) ? "" : token;     //处理null
        TokenExample tokenExample = new TokenExample();
        tokenExample.or().andTokenEqualTo(token);
        Token result = tokenMapper.selectByExample(tokenExample).get(0);
        if (result != null && result.getRequestTime().getTime() +
                result.getExpireTime() * 60 * 60 * 1000 >= new Date().getTime()) {
            //token没过期的情况下，根据URL查询当前用户权限是否满足
            String requestPermission = "";
            int nextIndex = requestURL.indexOf('/', 5);
            if (nextIndex > -1) {
                requestPermission = requestURL.substring(5, nextIndex);
            }
            if (!requestPermission.equals("")) {
                //请求所需要权限
                PermissionExample example = new PermissionExample();
                example.or().andNameEqualTo(requestPermission);
                List<Permission> permissionList = permissionMapper.selectByExample(example);
                //用户所拥有的权限
                UserRoleExample userRoleExample = new UserRoleExample();
                userRoleExample.or().andUserIdEqualTo(result.getUserId());
                List<UserRole> userRole = userRoleMapper.selectByExample(userRoleExample);
                if (permissionList.size() > 0 && userRole.size() > 0) {
                    int requestPermissionId = permissionList.get(0).getId();
                    int roleId = roleMapper.selectByPrimaryKey(userRole.get(0).getRoleId()).getId();
                    RolePermissionExample rpExample = new RolePermissionExample();
                    rpExample.or().andRoleIdEqualTo(roleId).andPermissionIdEqualTo(requestPermissionId);
                    List<RolePermission> list = rolePermissionMapper.selectByExample(rpExample);
                    if (list == null || list.size() == 0) {
                        //判断此用户没有请求需要的权限
                        result = null;
                    }
                } else {
                    //数据库对应字段缺失
                    result = null;
                }
            }
        } else {
            //token已经过期
            result = null;
        }
        return result;
    }

    @Override
    public User getUserByToken(String token) {
        User result = null;
        TokenExample tokenExample = new TokenExample();
        tokenExample.or().andTokenEqualTo(token);
        Token tokenObject = tokenMapper.selectByExample(tokenExample).get(0);
        if (tokenObject != null) {
            result = userMapper.selectByPrimaryKey(tokenObject.getUserId());
        }
        return result;
    }
}
