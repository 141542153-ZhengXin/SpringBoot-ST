package com.javatribe.springboot.web.pojo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @description: SysUser传输类
 * @author: zx
 * @date 2020/02/12
 **/
@Data
@Builder
public class SysUserDto {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

}