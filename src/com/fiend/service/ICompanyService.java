package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public interface ICompanyService {


    boolean updateCompany(Company companyEnt);

    List<Company> queryCompanyList();

    Company queryById(int id);

    PageModel<Company> queryPageList(Map<String, Object> map);
}
