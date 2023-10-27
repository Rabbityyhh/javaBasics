package com.rabbit.javaBasic.Result.exception;

import com.rabbit.javaBasic.Result.constant.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BizException extends RuntimeException {

    /**
     * 异常状态码
     */
    private String code;

    private Boolean success;

    /**
     * 接收枚举类型对象
     */
    public BizException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.success = resultCodeEnum.getSuccess();
    }

}