package com.rabbit.javaBasic.Thread.controller;

import com.rabbit.javaBasic.Thread.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HUAWEI
 * @date 2023/09/28
 */
@RestController
@RequestMapping("/thread")
@RequiredArgsConstructor
public class ThreadController {

    private final ThreadService threadService;

    @GetMapping("/firstThreadCase")
    public void firstThreadCase() {
        threadService.firstThreadCase();
    }

}
