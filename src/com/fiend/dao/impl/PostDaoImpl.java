package com.fiend.dao.impl;

import com.fiend.dao.IPostDao;
import com.fiend.entity.Post;
import com.fiend.util.BaseDao;

import java.util.List;

public class PostDaoImpl  extends BaseDao implements IPostDao {
    @Override
    public boolean addPost(Post postEnt) {
        //调用公共类的添加方法
        boolean bool = super.commonSaveOrUpdate((postEnt));
        return bool;
    }

    @Override
    public boolean updatePost(Post postEnt) {
        //调用公共类修改方法
        super.update(postEnt);
        return true;
    }

    @Override
    public boolean deletePost(int postId) {
        Post postEnt = (Post) super.commonGetObj(new Post(), postId);
        //调用公共类的删除方法
        boolean bool = super.commonDelete(postEnt);
        return bool;
    }

    @Override
    public Post queryById(Post postEnt, int id) {
        //调用公共类查询方法‘
        Post post = (Post) super.commonGetObj(postEnt, id);
        return post;
    }

    @Override
    public List<Post> queryByPerList(String hql) {
        //查询所有数据集合
        List<Post> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public List<Post> queryByPageList(String hql, Object... objects) {
        //调用分页工具 进行分页
        List<Post> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Post.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //分页总条数
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .uniqueResult();
        return Integer.parseInt(obj.toString());
    }

    @Override
    public List<Post> queryByNameAndSex(String hql) {
        List<Post> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Post.class)
                .list();
        return list;
    }
}
