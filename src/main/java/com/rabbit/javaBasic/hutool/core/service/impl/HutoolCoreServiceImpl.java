package com.rabbit.javaBasic.hutool.core.service.impl;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.convert.ConverterRegistry;
import com.rabbit.javaBasic.hutool.core.converter.CustomConverter;
import com.rabbit.javaBasic.hutool.core.service.HutoolCoreService;
import org.junit.Assert;
import org.springframework.stereotype.Service;

/**
 * @author yinhao
 * @date 2024/04/30
 */
@Service
public class HutoolCoreServiceImpl implements HutoolCoreService {
    @Override
    public Object convertTest() {

        // 工具类 类型转换
        int a = 454553;
        String aStr = Convert.toStr(a);

        // 自定义类型转换
        ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
        converterRegistry.putCustom(String.class, CustomConverter.class);

        String result = converterRegistry.convert(String.class, a);
        Assert.assertEquals("Custom: 454553", result);

        return null;
    }

    @Override
    public Object dateTest() {

        return null;
    }
}
