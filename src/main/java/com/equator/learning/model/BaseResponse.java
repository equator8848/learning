package com.equator.learning.model;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private int status;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    private BaseResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseResponse success(T data) {
        return new BaseResponse(200, "OK", data);
    }

    public static <T> BaseResponse success() {
        return new BaseResponse(200, "OK", null);
    }

    public static <T> BaseResponse error() {
        return new BaseResponse(500, "error", null);
    }
}
