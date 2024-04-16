package com.rabbit.javaBasic.MapStruct.controller;

import com.rabbit.javaBasic.MapStruct.service.TestMapStructService;
import com.rabbit.javaBasic.Result.result.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinhao
 * @date 2024/04/16
 *
 *  pom 中需要引入相关依赖。注意：需要在build中引入对应的打包插件。
 *
 *
 *
 */
@RestController
@RequestMapping("/testMapStruct")
@RequiredArgsConstructor
public class TestMapStructController {

    private final TestMapStructService testMapStructService;

    @GetMapping("testDto")
    public R<?> testDto() {
        return R.ok(testMapStructService.toDto());
    }

}
