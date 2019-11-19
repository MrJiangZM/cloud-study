package com.ming.blog.controller;

import com.ming.blog.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Zaiming
 * @date 2019/11/19 8:32 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class ThreeController {

    @GetMapping("/test1")
    public User getUser(Integer id) {
        System.out.println("============");
        return User.builder().id(3).name("three").build();
    }

}
