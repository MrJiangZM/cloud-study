package com.ming.blog.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Jiang Zaiming
 * @date 2019/11/4 7:12 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class Test {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public void test() {
        ServiceInstance choose = loadBalancerClient.choose("client-order");
        log.info("{}", choose.getPort());
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/demo")
    public String ConsumerDemo(){
        String object = this.restTemplate.getForObject("http://client-order:7900/test/demo", String.class);
        return object + "22222";
    }

}
