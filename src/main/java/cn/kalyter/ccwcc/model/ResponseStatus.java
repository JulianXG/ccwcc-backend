/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.model;

/**
 * 200~299表示成功
 * <p>400~499表示用户请求错误</p>
 * <p>500~599表示服务端出错</p>
 */
public class ResponseStatus {
    private int code;
    private String message;

    public ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
