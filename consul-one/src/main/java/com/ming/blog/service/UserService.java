package com.ming.blog.service;

import com.ming.blog.domain.User;
import com.ming.blog.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-two", fallback = UserServiceImpl.class)
public interface UserService {

    @GetMapping(value = "/test/test1", produces = "application/json;charset=UTF-8")
    public User getUser(@RequestParam("id") Integer id);

}
