package com.javatribe.springboot.web.pojo.domain;

import lombok.Data;

/**
 * @description: SysUser实体类
 * @author: zx
 * @date 2020/02/12
 **/
@Data
public class SysUserDo {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;
}
