package com.rabbit.javaBasic.Thread.ProductorAndConsumer;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
@Slf4j
@RequiredArgsConstructor
public class TicketProductor extends Thread{

    private final TicketSyncontainer container;

    private final UserMapper userMapper;


    @Override
    public void run() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getIdentity, 0);
        userMapper.selectList(null).forEach(user -> {
            try {
                dealUser(user);
                container.push(user);
                log.info("抓到了一个生产者：{}", user.getUserName());
            } catch (InterruptedException e) {
                log.info("生产者抓取失败");
            }
        });
    }

    private void dealUser(User user) {
        user.setId(null);
        user.setUserName(user.getUserName() + "生产者");
    }

}
