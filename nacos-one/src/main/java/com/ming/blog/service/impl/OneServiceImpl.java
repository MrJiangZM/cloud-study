package com.ming.blog.service.impl;

import com.ming.blog.domain.User;
import com.ming.blog.service.OneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Jiang Zaiming
 * @date 2019/11/19 8:46 下午
 */
@Slf4j
@Service
public class OneServiceImpl implements OneService {

    @Override
    public User getUser(Integer id) {
        return User.builder().name("又错了").id(1).build();
    }

}
