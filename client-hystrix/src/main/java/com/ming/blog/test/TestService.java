package com.ming.blog.test;

import com.ming.blog.test.impl.TestServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jiang Zaiming
 * @date 2019/11/9 3:49 下午
 */
@FeignClient(value = "client-order", fallback = TestServiceImpl.class)
public interface TestService {

    @GetMapping(value = "/test/ddd")
    String getOrder(@RequestParam(value = "id")String id);

}
