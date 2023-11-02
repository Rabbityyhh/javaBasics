package com.rabbit.javaBasic.optional.service.impl;

import com.rabbit.javaBasic.optional.dto.User;
import com.rabbit.javaBasic.optional.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public Object testOptional() {
        User user = getNullUser();
        System.out.println(user.getName());
        return "成功了";
    }

    public Object testOptionalUser() {
        Optional<User> user = getNullUserOptional();
        user.ifPresent(us -> {
            System.out.println(us.getName());
        });
        return "成功了";
    }

    public User getNullUser() {
        return null;
    }

    public Optional<User> getNullUserOptional() {
        return Optional.empty();
    }
}
