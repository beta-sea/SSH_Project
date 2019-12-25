package com.fiend.dao;

import com.fiend.entity.Company;

import java.util.List;

public interface ICompanyDao {


    boolean updateCompany(Company companyEnt);



    List<Company> queryByPerList(String hql);

    Company queryById(Company companyEnt, int id);


    List<Company> queryPageList(String hql, Object... objects);

    int queryPageCount(String hql, Object... objects);




}
