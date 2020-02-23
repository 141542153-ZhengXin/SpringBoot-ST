package com.javatribe.springboot.web.dao.mapper;

import com.javatribe.springboot.web.pojo.domain.SysUserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {

    /**
     * 根据用户id获取单个用户
     */
    SysUserDo findByUserId(@Param("userId") String userId);


}