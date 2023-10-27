package com.rabbit.javaBasic.Result.service;

import com.rabbit.javaBasic.Result.exception.BizException;
import com.rabbit.javaBasic.Result.constant.ResultCodeEnum;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    public String test(Long id) {
        int a= (int) (1 % id);
        if (id == 1) {
            throw new BizException(ResultCodeEnum.FAIL);
        } else if (id == 2) {
            throw new BizException(ResultCodeEnum.NO_ID);
        }
        return  "我不好使";
    }
}
