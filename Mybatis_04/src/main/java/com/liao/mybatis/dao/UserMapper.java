package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.User;

import java.util.List;

/**
 * @program: Mybatis_04
 * @description: UserMapper接口
 * @author: Mr.Hiro
 * @create: 2018-06-03 08:22
 **/
public interface UserMapper {
    /**
     * 根据用户名和id查询用户
     * @param user
     * @return
     */
    List<User> findUserBySql(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
