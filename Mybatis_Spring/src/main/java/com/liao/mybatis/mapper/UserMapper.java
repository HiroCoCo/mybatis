package com.liao.mybatis.mapper;

import com.liao.mybatis.pojo.User;

/**
 * 用户Mapper
 */
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findUserById(int id);
}
