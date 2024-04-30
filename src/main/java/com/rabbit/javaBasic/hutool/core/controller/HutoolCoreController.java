package com.rabbit.javaBasic.hutool.core.controller;

import com.rabbit.javaBasic.Result.result.R;
import com.rabbit.javaBasic.hutool.core.service.HutoolCoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinhao
 * @date 2024/04/30
 */
@RestController
@RequestMapping("/hutool/core")
@Api(tags = "hutool-core")
@RequiredArgsConstructor
public class HutoolCoreController {

    private final HutoolCoreService hutoolCoreService;

    @GetMapping("/convert")
    @ApiOperation("Convert测试")
    public R<?> getAll() {
        return R.ok(hutoolCoreService.convertTest());
    }

    @GetMapping("/date")
    @ApiOperation("date测试")
    public R<?> date() {
        return R.ok(hutoolCoreService.dateTest());
    }

}
