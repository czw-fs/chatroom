package com.fs.chatroom.entity;


import lombok.Data;

@Data
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



}