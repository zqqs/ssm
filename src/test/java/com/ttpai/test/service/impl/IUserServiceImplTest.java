package com.ttpai.test.service.impl;

import com.ttpai.test.model.User;
import com.ttpai.test.service.IUserService;
import com.ttpai.test.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2017/3/3 15:36
 */
public class IUserServiceImplTest extends BaseTest{

    private Logger logger = LoggerFactory.getLogger(IUserServiceImplTest.class);

    @Resource
    private IUserService userService;

    @Test
    public void testGetUserById() throws Exception {
        User user = userService.getUserById(1);
        System.out.println(user.getAge()+user.getId()+user.getUserName()+user.getPassword());
    }
}