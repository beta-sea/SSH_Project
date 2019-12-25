package com.fiend.service.impl;

import com.fiend.dao.IAbouDao;
import com.fiend.entity.Company;
import com.fiend.service.IAbouService;

public class AbouServiceImpl implements IAbouService {

    private IAbouDao abouDao;

    public IAbouDao getAbouDao() {
        return abouDao;
    }

    public void setAbouDao(IAbouDao abouDao) {
        this.abouDao = abouDao;
    }

    @Override
    public Company queryCom(int comId) {
        return abouDao.queryCom(comId);
    }
}
