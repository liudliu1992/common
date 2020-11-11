package com.leo.common.exception;

import com.leo.common.error.IErrorCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Ueat异常类
 *
 * @author leo
 * @version 1.0.0
 * @date 2019/11/29:上午12:08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class LeoException extends RuntimeException {

    private IErrorCode codeMsg;
    private Exception realException;


    public LeoException(IErrorCode codeMsg) {
        super(codeMsg.getMessage());
        this.codeMsg = codeMsg;
    }

    public LeoException(IErrorCode codeMsg, Exception realException) {
        super(codeMsg.getMessage());
        this.codeMsg = codeMsg;
        this.realException = realException;
    }
}
