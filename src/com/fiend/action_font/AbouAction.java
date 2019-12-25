package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.service.IAbouService;
import com.opensymphony.xwork2.ActionContext;

public class AbouAction {
    private IAbouService abouService;

    public IAbouService getAbouService() {
        return abouService;
    }

    public void setAbouService(IAbouService abouService) {
        this.abouService = abouService;
    }

    public String showInfoToAbou() {

        Company company = abouService.queryCom(1);
        ActionContext.getContext().put("company",company);

        return "showInfoToIndex";
    }

    public String showInfoToCompanyPhilosophy(){
        Company company = abouService.queryCom(1);
        ActionContext.getContext().put("company",company);

        return "showInfoToCompanyPhilosophy";
    }

}
