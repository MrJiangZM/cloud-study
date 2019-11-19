package com.ming.blog.service;

import com.ming.blog.domain.User;
import com.ming.blog.service.impl.OneServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jiang Zaiming
 * @date 2019/11/19 8:45 下午
 */
@FeignClient(value = "nacos-two", fallback = OneServiceImpl.class)
public interface OneService {

    @GetMapping(value = "/test/test1")
    public User getUser(@RequestParam("id") Integer id);

}
