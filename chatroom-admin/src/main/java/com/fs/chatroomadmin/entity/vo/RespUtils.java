package com.fs.chatroomadmin.entity.vo;


public class RespUtils<T> {

    private Integer code;

    private String msg;

    private T data;


    public RespUtils(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RespUtils(T data) {
        this.data = data;
    }

    public static <T> RespUtils<T> success(Integer code, String msg, T data) {
        return new RespUtils<T>(code, msg, data);
    }

    public static <T> RespUtils<T> success(String msg, T data) {
        return new RespUtils<T>(200, msg, data);
    }

    public static <T> RespUtils<T> success(T data) {
        return new RespUtils<T>(200, "success", data);
    }

    public static <T> RespUtils<T> fail(Integer code, String msg, T data) {
        return new RespUtils<T>(code, msg, data);
    }

    public static <T> RespUtils<T> fail(String msg, T data) {
        return new RespUtils<T>(500, msg, data);
    }

    public static <T> RespUtils<T> fail(T data) {
        return new RespUtils<T>(500, "fail", data);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "RespUtils{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}