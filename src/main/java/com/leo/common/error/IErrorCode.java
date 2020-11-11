package com.leo.common.error;

/**
 * @author liusl
 * @version 1.0
 * @date 2020/11/10 下午2:40
 */
public interface IErrorCode {
    /**
     * 获取错误代码
     * @return 错误代码
     */
     String getCode();

    /**
     * 获取错误消息
     * @return 错误消息
     */
    String getMessage();
}
