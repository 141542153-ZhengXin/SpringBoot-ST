package com.javatribe.springboot.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: 配置项类
 * @author: zx
 * @date 2020/02/08
 **/
@Component
public class Configuration {

    /**
     * 数据源登录名
     */
    public static String USER_NAME;

    /**
     * 数据源路径
     */
    public static String URL;

    /**
     * 数据源驱动
     */
    public static String DRIVER;

    @Value("${spring.datasource.druid.username}")
    public void setUsername(String username) {
        USER_NAME = username;
    }

    @Value("${spring.datasource.druid.url}")
    public void setUrl(String url) {
        URL = url;
    }

    @Value("${spring.datasource.druid.driver-class-name}")
    public void setDriver(String driver) {
        DRIVER = driver;
    }
}
