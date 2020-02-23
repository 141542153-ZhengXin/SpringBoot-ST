package com.javatribe.springboot.web.controller;

import com.baidu.unbiz.easymapper.MapperFactory;
import com.javatribe.springboot.web.pojo.dto.SysUserDto;
import com.javatribe.springboot.web.pojo.vo.SysUserVo;
import com.javatribe.springboot.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 用户controller
 * @author: zx
 * @date 2020/01/27
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public SysUserVo getUser(@RequestBody SysUserVo userVo) {
        SysUserDto userDto = userService.getUserByUserId(userVo.getUserId());
        userVo = MapperFactory.getCopyByRefMapper().mapClass(SysUserDto.class, SysUserVo.class).registerAndMap(userDto, SysUserVo.class);
        return userVo;
    }
}
