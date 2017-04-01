/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Pagination;
import cn.kalyter.ccwcc.model.User;

public interface UserService {
    User login(User user);

    User register(User user);

    Pagination getUserPagination(int page, int pageSize);
}
