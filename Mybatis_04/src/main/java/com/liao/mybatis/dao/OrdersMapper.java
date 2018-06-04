package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.OrdersCustom;

import java.util.List;

/**
 * @program: Mybatis_04
 * @description: OrdersMapper接口
 * @author: Mr.Hiro
 * @create: 2018-06-03 10:35
 **/
public interface OrdersMapper {
    /**
     * 查询所有订单信息
     * @return
     */
    List<OrdersCustom> findOrdersByUser();
}
