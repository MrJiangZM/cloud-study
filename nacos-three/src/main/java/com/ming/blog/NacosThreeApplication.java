package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Jiang Zaiming
 * @date 2019/11/19 8:27 下午
 */
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosThreeApplication.class, args);
        log.info("nacos three client start success");
    }

}
