package com.javatribe.springboot.web.service;

import com.javatribe.springboot.web.pojo.dto.SysUserDto;

public interface UserService {

    /**
     * 根据用户id获取单个用户
     * @param userId
     * @return
     */
    SysUserDto getUserByUserId(String userId);
}
