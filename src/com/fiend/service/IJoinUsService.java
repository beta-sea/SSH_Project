package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.Post;
import com.fiend.entity.Recruit;
import com.fiend.util.PageModel;

import java.util.Map;

public interface IJoinUsService {

    Company queryCom(int comId);

    boolean addRecruit(Recruit recruitEnt);

    PageModel<Post> queryPageList(Map<String,Object> map);



}
