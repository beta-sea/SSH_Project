package com.fiend.service.impl;

import com.fiend.dao.IContactDao;
import com.fiend.entity.Company;
import com.fiend.entity.Leaving;
import com.fiend.service.IContactService;


import java.util.List;

public class ContactServiceImpl implements IContactService {

    private IContactDao contactDao;

    public IContactDao getContactDao() {
        return contactDao;
    }

    public void setContactDao(IContactDao contactDao) {
        this.contactDao = contactDao;
    }


    @Override
    public Company queryCom(int comId) {
        return contactDao.queryCom(comId);
    }


    @Override
    public List<Leaving> queryByLeavingList() {
        String hql = "from Leaving";
        List<Leaving> list = contactDao.queryByLeavingList(hql);
        return list;
    }

    @Override
    public boolean addLeaving(Leaving leavingEnt) {
        return contactDao.addLeaving(leavingEnt);
    }
}
