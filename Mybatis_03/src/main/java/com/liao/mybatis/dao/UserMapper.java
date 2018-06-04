package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.QueryVo;
import com.liao.mybatis.pojo.User;

import java.util.List;

/**
 * @program: Mybatis_03
 * @description: UserMapper接口
 * @author: Mr.Hiro
 * @create: 2018-06-02 20:25
 **/
public interface UserMapper {
    /**
     * 根据条件查询用户
     * @param user
     * @return
     */
    List<User> findUser(User user);

    /**
     * 根据id集合查询用户
     * @param vo
     * @return
     */
    List<User> findUserByIds(QueryVo vo);
}
