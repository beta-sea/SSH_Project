package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.util.PageModel;

import java.util.Map;

public interface ICasesService {

    Company queryCom(int comId);

    PageModel<Servicecar> queryPageList(Map<String,Object> map);

}
