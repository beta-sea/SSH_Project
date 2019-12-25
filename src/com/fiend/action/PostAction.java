package com.fiend.action;


import com.fiend.entity.Post;
import com.fiend.service.IPostService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostAction {
    //创建参数
    private Post postEnt;

    //创建service层对象
    private IPostService postService;

    private int pageNo; //当前页数
    private int pageSize; //每页显示条数


    /**
     * 添加方法
     *
     */
    public String savePostEnt(){
        return "addPostEnt";
    }

    /**
     * 保存方法
     */
    public String addPostEnt(){

        boolean bool = postService.addPost(postEnt);
        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "addPostEnt";
        }else {
            return "errorInfo";
        }
    }

    /**
     * 查询用户列表
     */
    public String queryPersonList(){
        //调用Service
        List<Post> list = postService.queryPostList();

        //存入请求作用域request
        ActionContext.getContext().put("list",list);

        return "queryPersonList";
    }

    /**
     * 查询
     */
    public String queryByNameAndSex(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用业务层查询方法
        PageModel<Post> pg  = postService.queryByNameAndSex(postEnt,map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);
        return "queryByNameAndSex";
    }

    /**
     * 修改查询方法
     */
    public String queryById(){
        Post retPerEnt = postService.queryById(postEnt.getId());
            ActionContext.getContext().put("retPerEnt",retPerEnt);
        return "queryById";
    }

    /**
     * 修改保持数据
     * @return
     */
    public String upDateSavePerEnt(){
        Post per = postService.queryById(postEnt.getId());
        per.setJobName(postEnt.getJobName());
        per.setJobClaim(postEnt.getJobClaim());
        per.setNumber(postEnt.getNumber());
        per.setStorageId(postEnt.getStorageId());
        per.setStartTime(postEnt.getStartTime());
        per.setDeadline(postEnt.getDeadline());
        per.setDuties(postEnt.getDuties());
        per.setWorkAddress(postEnt.getWorkAddress());

        boolean bool = postService.updatePost(per);

        if (bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }

    }

    /**
     * 删除
     */
    public String deletePostEnt(){
        boolean bool = postService.deletePerson(postEnt.getId());

        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    /**
     * 分页
     */
    public String queryPageList(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service 中的分页方法
        PageModel<Post> pg = postService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);
        return "queryPageList";
    }

    public Post getPostEnt() { return postEnt; }

    public void setPostEnt(Post postEnt) { this.postEnt = postEnt; }

    public IPostService getPostEntityService() {return postService; }

    public void setPostService(IPostService getPostEntityService) { this.postService = getPostEntityService; }

    public int getPageNo() { return pageNo; }

    public void setPageNo(int pageNo) { this.pageNo = pageNo; }

    public int getPageSize() { return pageSize; }

    public void setPageSize(int pageSize) { this.pageSize = pageSize; }

}
