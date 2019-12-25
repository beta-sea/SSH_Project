package com.fiend.dao.impl;

import com.fiend.dao.IAbouDao;
import com.fiend.entity.Company;
import com.fiend.util.BaseDao;

public class AbouDaoImpl extends BaseDao implements IAbouDao {
    @Override
    public Company queryCom(int comId) {
            return (Company) super.commonGetObj(new Company(),comId);
    }
}
