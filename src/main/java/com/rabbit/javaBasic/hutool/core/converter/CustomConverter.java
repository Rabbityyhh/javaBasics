package com.rabbit.javaBasic.hutool.core.converter;

import cn.hutool.core.convert.Converter;

public class CustomConverter implements Converter<String> {

    @Override
    public String convert(Object o, String s) throws IllegalArgumentException {
        return "Custom: " + o.toString();
    }

    @Override
    public String convertWithCheck(Object value, String defaultValue, boolean quietly) {
        return Converter.super.convertWithCheck(value, defaultValue, quietly);
    }
}
