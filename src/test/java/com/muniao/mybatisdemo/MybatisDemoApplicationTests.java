package com.muniao.mybatisdemo;

import com.muniao.mybatisdemo.mapper.UserMapper;
import com.muniao.mybatisdemo.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisDemoApplicationTests
{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1()
    {
        List userList = userMapper.getAllUsers();
        System.out.println(userList);
    }

    @Test
    public void test2()
    {
        User user = new User();
        user.setName("小刘");
        user.setAge(36);

        userMapper.addUser(user);

        System.out.println(user);
    }

}
