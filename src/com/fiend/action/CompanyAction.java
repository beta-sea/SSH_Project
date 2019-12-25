package com.fiend.action;

import com.fiend.entity.Company;
import com.fiend.service.ICompanyService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyAction {
    private Company companyEnt;
    private ICompanyService companyService;
    private int pageNo;
    private int pageSize;

    public Company getCompanyEnt() {
        return companyEnt;
    }

    public void setCompanyEnt(Company companyEnt) {
        this.companyEnt = companyEnt;
    }

    public ICompanyService getCompanyService() {
        return companyService;
    }

    public void setCompanyService(ICompanyService companyService) {
        this.companyService = companyService;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public String queryCompanyList(){
        List<Company> list = companyService.queryCompanyList();
        ActionContext.getContext().put("list",list);

        return "queryCompanyList";
    }

    public String queryById(){
        Company retCompanyEnt = companyService.queryById(companyEnt.getId());
        ActionContext.getContext().put("retCompanyEnt",retCompanyEnt);
        return "queryById";
    }

    public String updateSavePerEnt(){
        Company company = companyService.queryById(companyEnt.getId());
        company.setCompanyAddress(companyEnt.getCompanyAddress());
        company.setCompanyName(companyEnt.getCompanyName());
        company.setCompanySynopsis(companyEnt.getCompanySynopsis());
        company.setContacts(companyEnt.getContacts());
        company.setMail(companyEnt.getMail());
        company.setPhone(companyEnt.getPhone());
        company.setQq(companyEnt.getQq());
        company.setTel(companyEnt.getTel());
        company.setZipCode(companyEnt.getZipCode());
        boolean bool = companyService.updateCompany(company);

        if(bool){
            pageNo = 1;
            pageSize = 10;
            this.queryPageList();
            return "caseDateSuccess";
        }else{
            return "caseDateError";
        }

    }

    public String turnToPageAdd(){
        return "turnToPageAdd";
    }

    public String queryPageList(){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //调用service中分页方法
        PageModel<Company> pg = companyService.queryPageList(map);
        //存入当前页数
        pg.setPageNo(pageNo);
        //存入作用域
        ActionContext.getContext().put("pg",pg);

        return "queryPageList";
    }







}
