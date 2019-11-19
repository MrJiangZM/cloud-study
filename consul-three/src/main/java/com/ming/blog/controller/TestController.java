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

    @GetMapping("/test2")
    public String test2(String word) {
        return word + "three";
    }

    @GetMapping("/test1")
    public User test1(String id) {
//        int i = 1 / 0;
        log.info("------------------------");
        return User.builder().id(666).build();
    }

}
