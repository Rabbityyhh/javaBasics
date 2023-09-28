package com.rabbit.javaBasic.Thread.ProductorAndConsumer;

import com.rabbit.javaBasic.Thread.dto.User;
import org.springframework.stereotype.Component;

/**
 * @author yinhao
 * @date 2023/09/28
 * 买票缓冲区
 */
@Component
public class TicketSyncontainer {

    // 容器大小
    User[] users = new User[10];
    int count = 0;

    // 生产者放入产品
    public synchronized void push(User user) throws InterruptedException {
        // 如果容器满了，就需要等待消费者消费
        if (count == users.length) {
            // 通知消费者消费，生产者等待
            this.wait();
        }
        // 如果容器没有满，就需要生产产品
        users[count] = user;
        count++;
        // 通知消费者消费
        this.notifyAll();
    }

    // 消费者消费产品
    public synchronized User pop() throws InterruptedException {
        // 如果容器没有产品，就需要等待生产者生产
        if (count == 0) {
            // 通知生产者生产，消费者等待
            this.wait();
        }
        // 如果容器有产品，就需要消费产品
        count--;
        User user = users[count];
        // 通知生产者生产
        this.notifyAll();
        return user;
    }

}
