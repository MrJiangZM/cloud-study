package com.ming.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Zaiming
 * @date 2019/11/20 4:34 下午
 */
@Slf4j
@RestController
public class TestController {

    @Value("${mydev}")
    private String userName;
    @Value("${profile}")
    private String profile;
    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public String home() {
        return "mydev: " + userName +"    profile:" + profile + " name:" + name;
    }

}
