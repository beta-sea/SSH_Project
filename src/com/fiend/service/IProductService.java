package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.Stock;
import com.fiend.util.PageModel;

import java.util.Map;

public interface IProductService {

    Company queryCom(int comId);

    PageModel<Stock> queryPageList(Map<String,Object> map);

}
