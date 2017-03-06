package com.ttpai.mybatis.dao;

import com.ttpai.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2017/3/6 16:29
 */
public interface UserMapper {

    // @Insert表示添加
    @Insert("INSERT INTO users (NAME ,age) VALUES (#{name} ,#{age})")
    public int addUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    public int deleteUser(@Param("id") int id);

    @Update("UPDATE users SET `NAME`=#{name} , age = #{age} WHERE id = #{id}")
    public int updateUser(User user);

    @Select("SELECT * FROM users")
    public List<User> selectAllUser();
}
