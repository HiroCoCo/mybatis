package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.User;

import java.util.List;

/**
 * @program: IDEAMybatis
 * @description: UserMapper接口
 * @author: Mr.Hiro
 * @create: 2018-06-04 14:39
 **/
public interface UserMapper {
    /**
     * 查询用户详情及下的订单详情
     * @return
     */
    List<User> findUserAndOrders();
}
