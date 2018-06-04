package com.liao.mybatis.pojo;

import java.util.List;

/**
 * @program: Mybatis_03
 * @description: 传递对象实体类
 * @author: Mr.Hiro
 * @create: 2018-06-02 22:45
 **/
public class QueryVo {
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
