package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.News;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface INewsFontService {

    Company queryCom(int comId);

    PageModel<News> queryPageList(Map<String,Object> map);

}
