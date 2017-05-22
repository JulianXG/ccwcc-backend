/**
 * Created by Kalyter on 12/24/2016.
 */
package cn.kalyter.ccwcc.model;

import java.util.HashMap;
import java.util.Map;

public class Response<T> {
    private int code;
    private String message;
    private T data;
//    private Map<String, Object> data;

    public Response() {
    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //
//    public Map<String, Object> getData() {
//        return data;
//    }
//
//    public void setData(Map<String, Object> data) {
//        this.data = data;
//    }

    public void setStatus(ResponseStatus status) {
        setCode(status.getCode());
        setMessage(status.getMessage());
    }

    /**
     * @return 返回无data的response
     */
    public static Response OK() {
        Response result = new Response();
        result.setStatus(Constant.OK);
        return result;
    }

    /**
     * @param data Map<String, Object>类型
     * @return 返回Map数据的response
     */
    public static <T> Response OK(T data) {
        Response<T> result = new Response<>();
        result.setStatus(Constant.OK);
        result.setData(data);
        return result;
    }
//
//    /**
//     * @param result Object类型
//     * @return 直接返回Object类型数据的response
//     */
//    public static Response OK(Object result) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("result", result);
//        return new Response(Constant.OK.getCode(), Constant.OK.getMessage(), map);
//    }
//
    public static Response STATUS(ResponseStatus status) {
        Response response = new Response();
        response.setCode(status.getCode());
        response.setMessage(status.getMessage());
        return response;
    }
}
