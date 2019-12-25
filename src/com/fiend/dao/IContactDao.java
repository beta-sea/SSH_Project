package com.fiend.dao;

import com.fiend.entity.Company;
import com.fiend.entity.Leaving;

import java.util.List;

public interface IContactDao {

    Company queryCom(int comId);

    List<Leaving> queryByLeavingList(String hql);

    boolean addLeaving(Leaving leavingEnt);
}
