package com.javatribe.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description: SpringBootStApplication
 * @author: zx
 * @date 2020/01/27
 **/
@SpringBootApplication
@MapperScan("com.javatribe.springboot.web.dao.mapper")
public class SpringBootStApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStApplication.class, args);
    }

}
