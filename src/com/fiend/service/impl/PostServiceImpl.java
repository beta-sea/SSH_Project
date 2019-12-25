package com.fiend.service.impl;

import com.fiend.dao.IPostDao;
import com.fiend.entity.Post;
import com.fiend.service.IPostService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class PostServiceImpl implements IPostService {

    //调用Dao层接口参数 生产get；set方法
    private IPostDao postDao;

    public IPostDao getPostDao() {return postDao;}

    public void setPostDao(IPostDao postDao) {this.postDao = postDao ; }

    @Override
    public boolean addPost(Post postEnt) {
        //添加
        boolean bool = postDao.addPost(postEnt);
        return bool;
    }

    @Override
    public boolean updatePost(Post postEnt) {
        boolean bool = postDao.updatePost(postEnt);
        return bool;
    }

    @Override
    public List<Post> queryPostList() {
        //查询语句拼写
        String hql = "from Post";
        List<Post> list = postDao.queryByPerList(hql);
        return list;
    }

    @Override
    public Post queryById(int postId) {
        Post postEnt = postDao.queryById(new Post(), postId);
        return postEnt;
    }

    @Override
    public boolean deletePerson(int postId) {
        boolean bool = postDao.deletePost(postId);
        return bool;
    }

    @Override
    public PageModel<Post> queryPageList(Map<String, Object> map) {
        //定义返对象
        PageModel<Post> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Post where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from Post");

        //查询
        List<Post> postList = postDao.queryByPageList(hql.toString());
        int totalNum = postDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(postList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }

    @Override
    public PageModel<Post> queryByNameAndSex(Post postEnt, Map<String, Object> map) {

        //定义返对象
        PageModel<Post> pg = new PageModel<>();
        //调用列表+总条数 方法查询将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        String name = "'%" + postEnt.getJobName()+ "%'";
        StringBuffer hql = new StringBuffer("select * from Post where jobName like "+ name +" limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from Post where jobName like "+name);

        //查询
        List<Post> postList = postDao.queryByNameAndSex(hql.toString());
        int totalNum = postDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(postList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;


    }
}
