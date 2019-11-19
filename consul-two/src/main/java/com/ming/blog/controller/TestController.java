package com.ming.blog.controller;

import com.ming.blog.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Zaiming
 * @date 2019/11/11 5:08 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    public User test1(String id) {
        log.info("==========================");
//        int i = 1 / 0;
        return User.builder().id(999).build();
    }


    @GetMapping("/test2")
    public String test2(String id) {
        return id + "two";
    }

}
