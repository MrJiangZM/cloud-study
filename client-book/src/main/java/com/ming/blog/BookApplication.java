package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jiang Zaiming
 * @date 2019/11/4 7:08 下午
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        log.info("book app start success");
    }

}
