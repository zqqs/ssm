package com.ttpai.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2017/3/6 17:10
 */
public class MybatisUtil {

    public static SqlSession getSqlSession() throws IOException {
        //mybatis 配置文件
        String mybatisConf = "mybatis-conf.xml";
        //使用类加载器加载
        //InputStream resourceAsStream = Test1.class.getClassLoader().getResourceAsStream(mybatisConf);
        //使用mybatis加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream(mybatisConf);
        //构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }

}
