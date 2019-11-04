package com.ming.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Zaiming
 * @date 2019/11/4 7:19 下午
 */
@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/demo")
    public String test() {
        return "55555";
    }

}
