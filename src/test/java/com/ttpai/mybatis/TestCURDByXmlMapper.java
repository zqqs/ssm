package com.ttpai.mybatis;

import com.ttpai.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @Description:测试xml配置的curd
 * @author: qing.zhang
 * @date: 2017/3/6 17:11
 */
public class TestCURDByXmlMapper {

    @Test
    public void testAddUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ttpai.mybatis.dao.UserMapper.addUser";
        User user = new User();
        user.setAge(18);
        user.setName("琪琪");
        sqlSession.insert(sql, user);
    }

    @Test
    public void testdelUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ttpai.mybatis.dao.UserMapper.deleteUser";
        sqlSession.delete(sql, 3);
    }

    @Test
    public void testselectAllUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ttpai.mybatis.dao.UserMapper.getAllUser";
        List<User> users = sqlSession.selectList(sql);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void updateUser() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ttpai.mybatis.dao.UserMapper.updateUser";
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("琪琪");
        sqlSession.update(sql, user);
    }


}
