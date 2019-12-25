package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.Leaving;

import java.util.List;

public interface IContactService {

    Company queryCom(int comId);

    List<Leaving> queryByLeavingList();

    boolean addLeaving(Leaving leavingEnt);

}
