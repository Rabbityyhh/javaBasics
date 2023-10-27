package com.rabbit.javaBasic.sse.controller;

import com.rabbit.javaBasic.sse.util.SseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/sse")
public class SseController {

    @Autowired
    private SseUtil sseUtil;


    @GetMapping(value = "/createSseConnect", produces="text/event-stream;charset=UTF-8")
    public SseEmitter createSseConnect(@RequestParam(name = "clientId", required = false) Long clientId) {
        return sseUtil.connect(clientId);
    }


    @PostMapping("/sendMessage")
    public void sendMessage(@RequestParam("clientId") Long clientId, @RequestParam("message")  String message){
        sseUtil.sendMessage(clientId, "123456789", message);
    }

    @GetMapping(value = "/listSseConnect")
    public Map<Long, SseEmitter> listSseConnect(){
        return sseUtil.listSseConnect();
    }


    /**
     * 关闭SSE连接
     *
     * @param clientId 客户端ID
     **/
    @GetMapping("/closeSseConnect")
    public String closeSseConnect(Long clientId) {
        sseUtil.deleteUser(clientId);
        return "Result.success()";
    }

}

