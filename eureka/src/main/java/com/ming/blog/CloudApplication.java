package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jiang Zaiming
 * @date 2019/11/4 4:51 下午
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
        log.info("app start success");
    }

}
