package com.ming.blog.controller;

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
    public String test1(String word) {
        return word + "three";
    }

}
