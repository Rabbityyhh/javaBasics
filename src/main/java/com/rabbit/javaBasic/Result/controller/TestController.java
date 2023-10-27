package com.rabbit.javaBasic.Result.controller;

import com.rabbit.javaBasic.Result.result.R;
import com.rabbit.javaBasic.Result.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testResult")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("{id}")
    private R test(@PathVariable Long id) {
        return R.ok(testService.test(id));
    }

}
