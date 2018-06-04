package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    /**
     * 查询所有订单
     * @return
     */
    List<Orders> findOrdersList();
}
