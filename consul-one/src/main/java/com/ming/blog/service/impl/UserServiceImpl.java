package com.ming.blog.service.impl;

import com.ming.blog.domain.User;
import com.ming.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserServiceImpl implements UserService {

    public User getUser(Integer id) {
        return User.builder().id(1000).build();
    }
}
