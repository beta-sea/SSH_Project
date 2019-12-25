package com.fiend.dao.impl;

import com.fiend.dao.IContactDao;
import com.fiend.entity.Company;
import com.fiend.entity.Leaving;
import com.fiend.util.BaseDao;

import java.util.List;

public class ContactDaoImpl extends BaseDao implements IContactDao {

    @Override
    public Company queryCom(int comId) {
        return (Company) super.commonGetObj(new Company(),comId);
    }

    @Override
    public List<Leaving> queryByLeavingList(String hql) {
        return commonQuery(hql);
    }

    @Override
    public boolean addLeaving(Leaving leavingEnt) {
        return super.commonSaveOrUpdate(leavingEnt);
    }
}
