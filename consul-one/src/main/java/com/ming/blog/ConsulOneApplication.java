package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jiang Zaiming
 * @date 2019/11/11 3:44 下午
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOneApplication.class, args);
        log.info("consul one client start");
    }

}
