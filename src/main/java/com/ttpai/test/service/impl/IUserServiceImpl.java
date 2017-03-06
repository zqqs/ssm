package com.ttpai.test.service.impl;

import com.ttpai.test.dao.UserMapper;
import com.ttpai.test.model.User;
import com.ttpai.test.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2017/3/3 15:28
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
