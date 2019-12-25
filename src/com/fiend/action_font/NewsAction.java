package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.News;
import com.fiend.service.INewsFontService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.Map;

public class NewsAction {

    private INewsFontService newsFontService;
    private Map<String, Object> map = new HashMap<>();


    public String showInfoToNews() {

        Company company = newsFontService.queryCom(1);
        ActionContext.getContext().put("company",company);

        PageModel<News> pg = newsFontService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "showInfoToNews";
    }



    public INewsFontService getNewsFontService() {
        return newsFontService;
    }

    public void setNewsFontService(INewsFontService newsFontService) {
        this.newsFontService = newsFontService;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
