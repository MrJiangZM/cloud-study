package com.ming.blog.controller;

import com.ming.blog.domain.User;
import com.ming.blog.service.OneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jiang Zaiming
 * @date 2019/11/19 8:32 下午
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class OneController {

    @Resource
    private OneService oneService;

    @GetMapping("/test1")
    public User getUser() {
        return oneService.getUser(1);
    }

}
