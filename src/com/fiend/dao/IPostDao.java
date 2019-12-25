package com.fiend.dao;

import com.fiend.entity.Post;

import java.util.List;

public interface IPostDao {
    //接口方法
    boolean addPost(Post postEnt);

    boolean updatePost(Post postEnt);

    boolean deletePost(int postId);

    Post queryById(Post postEnt, int id);

    List<Post> queryByPerList(String hql);

    /**
     * 分页
     */
    List<Post> queryByPageList(String hql, Object... objects);

    /**
     * 返回数据总条数
     * @return
     */
    int queryPageCount(String hql, Object... objects);

    /**
     * 查找
     */
    List<Post> queryByNameAndSex(String hql);
}
