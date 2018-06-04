package com.liao.mybatis.pojo;

/**
 * @program: Mybatis_04
 * @description: Orders关联查询类
 * @author: Mr.Hiro
 * @create: 2018-06-03 10:32
 **/
public class OrdersCustom extends Orders {

    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
