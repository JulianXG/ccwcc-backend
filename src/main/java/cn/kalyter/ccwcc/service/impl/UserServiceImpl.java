/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.UserCheckpointMapper;
import cn.kalyter.ccwcc.dao.UserMapper;
import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.UserService;
import cn.kalyter.ccwcc.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UtilService utilService;
    @Autowired
    private UserCheckpointMapper userCheckpointMapper;

    @Override
    public int update(User user) {
        User sourceUser = userMapper.selectByPrimaryKey(user.getId());
        user = utilService.fillData(sourceUser, user);
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User get(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setPassword(null);
        return user;
    }

    @Override
    public int delete(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        assert user != null;
        user.setIsDeleted(true);
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public Response login(User user) {
        Response response = new Response();
        user.setPassword(user.getPassword().toLowerCase());
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(user.getPassword());

        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0) {
            User selectUser = users.get(0);
            UserCheckpointExample checkpointExample = new UserCheckpointExample();
            checkpointExample.or().andUserIdEqualTo(selectUser.getId());
            List<UserCheckpoint> userCheckpoints = userCheckpointMapper.selectByExample(checkpointExample);
            boolean isCheckpointLegal = false;
            for (UserCheckpoint userCheckpoint : userCheckpoints) {
                if (userCheckpoint.getCheckpointId() == user.getCheckpointId() ||
                        userCheckpoint.getCheckpointId() == 0) {
                    isCheckpointLegal = true;
                    break;
                }
            }
            if (isCheckpointLegal) {
                Date now = new Date();
                Date lastLoginTime = selectUser.getLoginTime();
                if (lastLoginTime == null) {
                    selectUser.setLastLoginTime(now);
                }
                selectUser.setLastLoginTime(lastLoginTime);
                selectUser.setLoginTime(now);
                Integer loginCount = selectUser.getLoginCount();
                if (loginCount == null) {
                    loginCount = 0;
                }
                selectUser.setLoginCount(loginCount + 1);
                userMapper.updateByPrimaryKeySelective(selectUser);
                selectUser.setPassword(null);     //清除密码信息
                response.setStatus(Constant.OK);
                response.setData(selectUser);
            } else {
                response.setStatus(Constant.CHECKPOINT_ERROR);
            }
        } else {
            response.setStatus(Constant.USERNAME_OR_PASSWORD_ERROR);
        }
        return response;
    }

    @Override
    public User register(User user) {
        user.setSex(user.getSex().equals("") ? null : user.getSex());
        try {
            int id = userMapper.insertSelective(user);
            user.setId(id);
            user.setPassword(null);
            return user;
        } catch (DuplicateKeyException e) {
            return null;
        }
    }

    @Override
    public Pagination getUserPagination(int page, int pageSize) {
        Pagination<User> result = new Pagination<>();
        UserExample example = new UserExample();
        example.or().andIsDeletedEqualTo(false);
        example.setLimitStart((page - 1) * pageSize);
        example.setLimitEnd(pageSize);
        List<User> list = userMapper.selectByExample(example);
        for (User user : list) {
            user.setPassword(null);
        }
        result.setRows(list);
        result.setPage(page);
        result.setPageSize(pageSize);
        result.setTotal(userMapper.countByExample(example));
        return result;
    }
}
