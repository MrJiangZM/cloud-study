package com.ming.blog.test.impl;

import com.ming.blog.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * @author Jiang Zaiming
 * @date 2019/11/9 3:53 下午
 */
@Slf4j
@Component
public class TestServiceImpl implements TestService {

    @Override
    public String getOrder(String id) {
        return "那个服务报错了啊 ";
    }


}
