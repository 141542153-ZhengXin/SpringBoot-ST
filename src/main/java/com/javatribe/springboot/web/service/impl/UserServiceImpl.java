package com.javatribe.springboot.web.service.impl;

import com.baidu.unbiz.easymapper.MapperFactory;
import com.javatribe.springboot.web.dao.mapper.SysUserMapper;
import com.javatribe.springboot.web.pojo.domain.SysUserDo;
import com.javatribe.springboot.web.pojo.dto.SysUserDto;
import com.javatribe.springboot.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 用户业务类
 * @author: zx
 * @date 2020/02/12
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUserDto getUserByUserId(String userId) {
        SysUserDo userDo = userMapper.findByUserId(userId);
        SysUserDto userDto = MapperFactory.getCopyByRefMapper().mapClass(SysUserDo.class, SysUserDto.class).registerAndMap(userDo, SysUserDto.class);
        return userDto;
    }
}
