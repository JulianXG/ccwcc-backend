/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.UserMapper;
import cn.kalyter.ccwcc.model.Pagination;
import cn.kalyter.ccwcc.model.User;
import cn.kalyter.ccwcc.model.UserExample;
import cn.kalyter.ccwcc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(user.getPassword());
        User result = null;
        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0) {
            result = users.get(0);
            Date now = new Date();
            Date lastLoginTime = result.getLoginTime();
            if (lastLoginTime == null) {
                result.setLastLoginTime(now);
            }
            result.setLastLoginTime(lastLoginTime);
            result.setLoginTime(now);
            Integer loginCount = result.getLoginCount();
            if (loginCount == null) {
                loginCount = 0;
            }
            result.setLoginCount(loginCount + 1);
            userMapper.updateByPrimaryKeySelective(result);
            result.setPassword(null);     //清除密码信息
        }
        return result;
    }

    @Override
    public User register(User user) {
        int id = userMapper.insertSelective(user);
        user.setId(id);
        user.setPassword(null);
        return user;
    }

    @Override
    public Pagination getUserPagination(int page, int pageSize) {
        Pagination<User> result = new Pagination<>();
        UserExample example = new UserExample();
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
