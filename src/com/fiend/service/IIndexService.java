package com.fiend.service;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.entity.Stock;

import java.util.List;

public interface IIndexService {

    List<Servicecar> listServiceCar();

    Company queryCom(int comId);

    List<Servicesmall> serviceSmallList();

    List<Stock> queryStock();

}
