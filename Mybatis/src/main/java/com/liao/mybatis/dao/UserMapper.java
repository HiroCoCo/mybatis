package com.liao.mybatis.dao;

import com.liao.mybatis.pojo.QueryVo;
import com.liao.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据传递对象查询用户
     *  @param vo
     * @return
     */
    List<User> findUserByQueryVo(QueryVo vo);
}
