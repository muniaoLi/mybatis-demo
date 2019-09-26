package com.muniao.mybatisdemo.mapper;

import com.muniao.mybatisdemo.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-05-31 16:36
 */
@Mapper
@Repository
public interface UserMapper
{

    @Select("select * from user")
    List<User> getAllUsers();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("select * from user where id=#{id}")
    User getUserById(Long id);

    @Select("select * from user where name like concat('%',#{name},'%')")
    List<User> getUsersByName(String name);

    @Insert({"insert into user(name,age) values(#{name},#{age})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Long.class)
    Integer addUser(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    Integer updateUserById(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteUserById(Integer id);

}
