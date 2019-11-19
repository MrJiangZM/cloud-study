package com.ming.blog.controller;

import com.ming.blog.domain.User ;
import com.ming.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
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
    @Resource
    private UserService userService;

    @GetMapping("/test1")
    public String test1(String word) {
        // 通过这个获取不到数据
        List<ServiceInstance> instances = discoveryClient.getInstances("consul-member");
        System.out.println(instances);
        return word + "one";
    }

    @GetMapping("/test2")
    public User test2(String word) {
        // 通过这个获取不到数据
        User user = userService.getUser(1);
        return user;
    }

}
