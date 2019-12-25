package com.fiend.dao.impl;

import com.fiend.dao.ICompanyDao;
import com.fiend.entity.Company;
import com.fiend.util.BaseDao;

import java.util.List;

public class CompanyDaoImpl extends BaseDao implements ICompanyDao {
    @Override
    public boolean updateCompany(Company companyEnt) {

        super.update(companyEnt);
        return true;
    }

    @Override
    public List<Company> queryByPerList(String hql) {
        return super.commonQuery(hql);
    }

    @Override
    public Company queryById(Company companyEnt, int id) {
        return (Company)super.commonGetObj(companyEnt,id);
    }

    @Override
    public List<Company> queryPageList(String hql, Object... objects) {
        List<Company> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Company.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        Object obj = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql).uniqueResult();
        return Integer.parseInt(obj.toString());
    }
}
