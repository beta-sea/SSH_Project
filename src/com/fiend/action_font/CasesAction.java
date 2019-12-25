package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.service.ICasesService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.Map;

public class CasesAction {

    private ICasesService casesService;
    private Map<String, Object> map = new HashMap<>();


    public String showInfoToCases() {

        Company company = casesService.queryCom(1);
        ActionContext.getContext().put("company",company);

        PageModel<Servicecar> pg = casesService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "showInfoToCases";
    }



    public ICasesService getCasesService() {
        return casesService;
    }

    public void setCasesService(ICasesService casesService) {
        this.casesService = casesService;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
