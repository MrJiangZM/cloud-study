package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jiang Zaiming
 * @date 2019/11/11 3:49 下午
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulTwoApplication.class, args);
        log.info("consul two client start");
    }

    // 解决RestTemplate 找不到原因 应该把restTemplate注册到SpringBoot容器中@bean
    // 如果使用rest方式以别名方式进行调用必须依赖ribbon负载均衡
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
