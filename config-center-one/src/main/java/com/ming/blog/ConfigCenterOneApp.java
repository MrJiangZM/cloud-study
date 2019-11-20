package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jiang Zaiming
 * @date 2019/11/20 10:35 上午
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCenterOneApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterOneApp.class, args);
        log.info("config center one client start success");
    }

}
