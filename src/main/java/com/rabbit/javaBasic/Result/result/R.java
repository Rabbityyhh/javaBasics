package com.rabbit.javaBasic.Result.result;

import com.rabbit.javaBasic.Result.constant.ResultCodeEnum;

public class R<T> extends JsonResponse<T> {

    public static <T> R<T> build(T data, ResultCodeEnum resultCodeEnum) {
        R<T> result = new R<>();
        if (data != null) {
            result.setResult(data);
        }
        result.setErrorCode(resultCodeEnum.getCode());
        result.setErrorMsg(resultCodeEnum.getMessage());
        result.setSuccess(resultCodeEnum.getSuccess());
        return result;
    }

    /**
     * 抛异常
     */
    public static <T> R<T> build(T data, String code, String message, Boolean success) {
        R<T> result = new R<>();
        if (data != null) {
            result.setResult(data);
        }
        result.setErrorCode(code);
        result.setErrorMsg(message);
        result.setSuccess(success);
        return result;
    }

    public static <T> R<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> R<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }

}
