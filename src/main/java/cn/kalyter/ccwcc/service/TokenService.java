/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Token;
import cn.kalyter.ccwcc.model.User;

public interface TokenService {
    /**
     * 获取token，并将token持久化
     * @param user  生成token时的依据
     * @return  相关生成的token上下文信息
     */
    Token getToken(User user);

    /**
     * 在系统中注销token
     * @param token 期望注销的token值
     */
    void clearToken(String token);

    /**
     * 检测token值是否合法
     * @param token 期望检查的token值
     * @param requestURL 相对URL路径，段路径
     * @return 验证通过返回与此token值相关的token上下文信息，没通过返回null
     */
    Token validateToken(String token, String requestURL);

    /**
     * 通过传过来的token，获得user
     * @param token 请求中携带的token
     * @return token对应user不为空返回user，为空返回null
     */
    User getUserByToken(String token);
}
