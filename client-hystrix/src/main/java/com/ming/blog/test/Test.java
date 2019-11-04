package com.ming.blog.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Jiang Zaiming
 * @date 2019/11/4 8:04 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class Test {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMethod")
    @GetMapping("/test")
    public String test() {
        String object = this.restTemplate.getForObject("http://client-order:7900/test/demo", String.class);
        return object + "22222";
    }

    public String errorMethod() {
        return "这个是错的";
    }

}
