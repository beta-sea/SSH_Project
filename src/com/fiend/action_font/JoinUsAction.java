package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.Post;
import com.fiend.entity.Recruit;
import com.fiend.service.IJoinUsService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.Map;

public class JoinUsAction {

    private IJoinUsService joinUsService;
    private Map<String, Object> map = new HashMap<>();

    private Recruit recruitEnt;

    /**
     * 添加方法
     *
     */
    public String saveRecruitEnt(){

        Company company = joinUsService.queryCom(1);
        ActionContext.getContext().put("company",company);

        ActionContext.getContext().put("job",recruitEnt.getJob());
        return "addRecruitEnt";
    }

    /**
     * 保存方法
     */
    public String addRecruitEnt(){

        boolean bool = joinUsService.addRecruit(recruitEnt);
        if(bool){
            this.showInfoToJoinUs();
            return "caseDateSuccess";
        }else {
            return "errorInfo";
        }
    }

    public String showInfoToJoinUs() {

        Company company = joinUsService.queryCom(1);
        ActionContext.getContext().put("company",company);

        PageModel<Post> pg = joinUsService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "showInfoToJoinUs";
    }


    public IJoinUsService getJoinUsService() {
        return joinUsService;
    }

    public void setJoinUsService(IJoinUsService joinUsService) {
        this.joinUsService = joinUsService;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Recruit getRecruitEnt() {
        return recruitEnt;
    }

    public void setRecruitEnt(Recruit recruitEnt) {
        this.recruitEnt = recruitEnt;
    }
}
