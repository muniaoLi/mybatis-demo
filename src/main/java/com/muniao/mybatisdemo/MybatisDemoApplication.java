package com.muniao.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.muniao.mybatisdemo.mapper")
public class MybatisDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

}
