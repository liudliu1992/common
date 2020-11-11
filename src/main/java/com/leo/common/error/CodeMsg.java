package com.leo.common.error;

import lombok.Getter;

/**
 * 返回错误码
 *
 * @author leo
 * @version 1.0.0
 * @date 2019/11/28:下午10:55
 */
@Getter
public class CodeMsg implements IErrorCode {
    private int code;
    private String message;

    private CodeMsg() {
    }

    private CodeMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CodeMsg build(int code, String msg) {
        return new CodeMsg(code,msg);
    }

    public static CodeMsg SUCCESS = new CodeMsg(0, "请求成功");
}
