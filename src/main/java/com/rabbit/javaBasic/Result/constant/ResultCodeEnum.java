package com.rabbit.javaBasic.Result.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {
    // 返回类型
    SUCCESS("200", "成功", true),
    FAIL("201", "失败", false),
    NO_ID("203", "没有找到ID", false),
    ;

    /**
     * 状态码
     */
    private final String code;

    /**
     * 信息
     */
    private final String message;

    /**
     * 是否成功
     */
    private final Boolean success;

}
