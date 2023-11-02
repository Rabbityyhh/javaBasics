package com.rabbit.javaBasic.optional.controller;

import com.rabbit.javaBasic.Result.result.R;
import com.rabbit.javaBasic.optional.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("optional")
@RequiredArgsConstructor
public class TestOptionalController {

    private final TestService testService;

    @GetMapping("i")
    public R<?> test() {
        return R.ok(testService.testOptional());
    }

    @GetMapping("a")
    public R<?> testop() {
        return R.ok(testService.testOptionalUser());
    }

}
