package com.ming.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jiang Zaiming
 * @date 2019/11/11 5:08 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/test1")
    public String test1(String word) {
        List<ServiceInstance> instances = discoveryClient.getInstances("consul-member");
        System.out.println(instances);
        return word + "one";
    }

}
