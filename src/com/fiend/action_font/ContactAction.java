package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.Leaving;
import com.fiend.service.IContactService;
import com.opensymphony.xwork2.ActionContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ContactAction {

    private IContactService contactService;
    private Leaving leavingEnt;




    public String showInfoToContact() {

        Company company = contactService.queryCom(1);
        ActionContext.getContext().put("company",company);

        return "showInfoToContact";
    }


    public String showInfoToFeedback() {

        Company company = contactService.queryCom(1);
        ActionContext.getContext().put("company",company);

        return "showInfoToFeedback";
    }

    public String showInfoToFeedBackDetail() {

        Company company = contactService.queryCom(1);
        ActionContext.getContext().put("company",company);
        List list = contactService.queryByLeavingList();
        ActionContext.getContext().put("list",list);

        return "showInfoToFeedBackDetail";
    }



    public String addLeavingEnt() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        leavingEnt.setMessageDate(df.format(new Date()));
        boolean bool = contactService.addLeaving(leavingEnt);
        if (bool) {
            this.showInfoToFeedback();
            return "caseDateSuccess";
        } else {
            return "errorInfo";
        }

    }


    public IContactService getContactService() {
        return contactService;
    }

    public void setContactService(IContactService contactService) {
        this.contactService = contactService;
    }

    public Leaving getLeavingEnt() {
        return leavingEnt;
    }

    public void setLeavingEnt(Leaving leavingEnt) {
        this.leavingEnt = leavingEnt;
    }
}
