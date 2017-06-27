/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Pagination;
import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.model.User;
import cn.kalyter.ccwcc.model.UserEmail;

import java.util.Map;

public interface UserService {
    int update(User user);

    User get(int id);

    int delete(int id);

    Response login(User user);

    User register(User user);

    Pagination getUserPagination(int page, int pageSize);

    int changePassword(int userId, String password);

    boolean checkUsername(String username);

    int checkUsernameEmail(UserEmail userEmail);
}
