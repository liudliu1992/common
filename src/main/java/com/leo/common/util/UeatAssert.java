package com.leo.common.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import com.leo.common.exception.LeoException;
import com.sun.istack.internal.Nullable;
import com.leo.common.error.IErrorCode;

import java.util.Collection;
import java.util.Map;

/**
 * 错误处理类
 *
 * @author leo
 * @version 1.0.0
 * @date 2019/11/29:上午12:16
 */
public class UeatAssert {

    private UeatAssert() {

    }

    public static void state(boolean expression, IErrorCode message) {
        if (!expression) {
            throw new LeoException(message);
        }
    }


    public static void isTrue(boolean expression, IErrorCode message) {
        if (!expression) {
            throw new LeoException(message);
        }
    }


    public static void isNull(@Nullable Object object, IErrorCode message) {
        if (object != null) {
            throw new LeoException(message);
        }
    }


    public static void notNull(@Nullable Object object, IErrorCode message) {
        if (object == null) {
            throw new LeoException(message);
        }
    }

    public static void notEmpty(@Nullable Object[] array, IErrorCode message) {
        if (ArrayUtil.isEmpty(array)) {
            throw new LeoException(message);
        }
    }


    public static void noNullElements(@Nullable Object[] array, IErrorCode message) {
        if (array != null) {
            Object[] var2 = array;
            int var3 = array.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                Object element = var2[var4];
                if (element == null) {
                    throw new LeoException(message);
                }
            }
        }

    }


    public static void notEmpty(@Nullable Collection<?> collection, IErrorCode message) {
        if (CollectionUtil.isEmpty(collection)) {
            throw new LeoException(message);
        }
    }


    public static void notEmpty(@Nullable Map<?, ?> map, IErrorCode message) {
        if (CollectionUtil.isEmpty(map)) {
            throw new LeoException(message);
        }
    }

    private static boolean endsWithSeparator(String msg) {
        return msg.endsWith(":") || msg.endsWith(";") || msg.endsWith(",") || msg.endsWith(".");
    }
}
