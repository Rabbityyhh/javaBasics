package com.rabbit.javaBasic.Thread.service.impl;

import com.rabbit.javaBasic.Thread.ProductorAndConsumer.TicketConsumer;
import com.rabbit.javaBasic.Thread.ProductorAndConsumer.TicketProductor;
import com.rabbit.javaBasic.Thread.ProductorAndConsumer.TicketSyncontainer;
import com.rabbit.javaBasic.Thread.dao.UserMapper;
import com.rabbit.javaBasic.Thread.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author HUAWEI
 */
@Service
@RequiredArgsConstructor
public class ThreadServiceImpl implements ThreadService {

    private final UserMapper userMapper;

    @Override
    public void firstThreadCase() {
        TicketSyncontainer container = new TicketSyncontainer();
        new TicketProductor(container, userMapper).start();
        new TicketConsumer(container, userMapper).start();
    }

}
