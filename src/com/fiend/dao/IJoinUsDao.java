package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.Post;
import com.fiend.entity.Recruit;

import java.util.List;

public interface IJoinUsDao {

    Company queryCom(int comId);

    List<Post> queryPostList(String sql);

    boolean addRecruit(Recruit recruitEnt);

    int queryPageCount(String hql, Object ...objects);

}
