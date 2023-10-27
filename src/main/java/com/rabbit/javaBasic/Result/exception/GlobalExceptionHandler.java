package com.rabbit.javaBasic.Result.exception;

import com.rabbit.javaBasic.Result.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();
        return R.fail(e.getMessage());
    }

    /**
     * 自定义异常类 BizException
     */
    @ExceptionHandler(BizException.class)
    @ResponseBody
    public R<?> error(BizException bizException) {
        return R.build(null, bizException.getCode(), bizException.getMessage(), bizException.getSuccess());
    }

}
