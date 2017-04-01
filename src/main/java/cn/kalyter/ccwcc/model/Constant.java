/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.model;

public class Constant {
    public static final ResponseStatus OK =
            new ResponseStatus(200, "请求成功");
    public static final ResponseStatus USERNAME_OR_PASSWORD_ERROR =
            new ResponseStatus(400, "用户名或密码错误");
    public static final ResponseStatus TOKEN_NOT_EXIST_OR_INVALID_ERROR =
            new ResponseStatus(401, "token不存在或以过期");
    public static final ResponseStatus AUTH_ERROR =
            new ResponseStatus(403, "验证出错，请求被禁止");

    public static final int DEFAULT_EXPIRE_TIME = 24;
}
