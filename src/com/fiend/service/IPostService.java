package com.fiend.service;

import com.fiend.entity.Post;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface IPostService {
    /**
     * 添加修改
     */
    boolean addPost(Post postEnt);

    boolean updatePost(Post postEnt);

    /**
     * 列表查询
     */
    List<Post> queryPostList();

    /**
     * 通过id查询
     */
    Post queryById(int postId);

    /**
     * 删除
     */
    boolean deletePerson(int postId);

    /**
     * 分页
     */
    PageModel<Post> queryPageList(Map<String, Object> map);

    /**
     * 查询
     */
    PageModel<Post> queryByNameAndSex(Post postEnt, Map<String, Object> map);
}
