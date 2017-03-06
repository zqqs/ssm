package com.ttpai.mybatis;

import com.ttpai.mybatis.dao.UserMapper;
import com.ttpai.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @Description:测试注解
 * @author: qing.zhang
 * @date: 2017/3/6 17:33
 */
public class TestCURDByAnnotation {

    @Test
    public void testselectAllUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testaddUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAge(18);
        user.setName("琪琪");
        int i = mapper.addUser(user);
        System.out.println(i);

        user.setId(2);
        int i1 = mapper.updateUser(user);
        System.out.println(i1);
    }

    @Test
    public void testdelUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        System.out.println(i);
    }
}
