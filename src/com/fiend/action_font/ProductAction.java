package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.Stock;
import com.fiend.service.IProductService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.Map;

public class ProductAction {

    private IProductService productService;
    private Map<String, Object> map = new HashMap<>();


    public String showInfoToProduct() {

        Company company = productService.queryCom(1);
        ActionContext.getContext().put("company",company);

        PageModel<Stock> pg = productService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "showInfoToProduct";
    }



    public IProductService getProductService() {
        return productService;
    }

    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
