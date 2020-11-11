package com.leo.common.res;

import com.leo.common.error.IErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回统一数据结构
 *
 * @author leo
 * @since 1.0
 */
@Data
public class ApiResult<T> implements Serializable {

    private boolean success;
    private int code;
    private String msg;
    private T data;
    private Long systemTime;

    private ApiResult() {
        this.success = true;
        this.systemTime = System.currentTimeMillis();
    }

    private ApiResult(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.systemTime = System.currentTimeMillis();
    }

    private ApiResult(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.systemTime = System.currentTimeMillis();
    }

    public static ApiResult<String> ofSuccess() {
        return new ApiResult<String>();
    }

    public static <T> ApiResult<T> ofSuccess(T data) {
        return new ApiResult<T>(true, -1, "", data);
    }

    public static ApiResult<String> failure(int code, String msg) {
        return new ApiResult<String>(false, code, msg);
    }

    public static <T> ApiResult<T> failure(int code, String msg, T data) {
        return new ApiResult<T>(false, code, msg, data);
    }

    public static ApiResult<String> failure(IErrorCode notFound) {
        return new ApiResult<String>(false, notFound.getCode(), notFound.getMessage());
    }
}
