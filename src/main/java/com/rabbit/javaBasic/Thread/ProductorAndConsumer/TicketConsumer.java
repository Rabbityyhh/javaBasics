package com.rabbit.javaBasic.Thread.ProductorAndConsumer;

import com.rabbit.javaBasic.Thread.dao.UserMapper;
import com.rabbit.javaBasic.Thread.dto.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yinhao
 * @date 2023/09/28
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class TicketConsumer extends Thread{

    private final TicketSyncontainer container;

    private final UserMapper userMapper;

    @Override
    public void run() {
        try {
            while (true) {
                User user = container.pop();
                userMapper.insert(user);
                log.info("新增了一个消费者：{}", user.getUserName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
