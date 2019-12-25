package com.fiend.action_font;

import com.fiend.entity.Company;
import com.fiend.entity.Servicecar;
import com.fiend.entity.Servicesmall;
import com.fiend.entity.Stock;
import com.fiend.service.IIndexService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class IndexAction extends ActionSupport {

    private IIndexService indexService;

    public IIndexService getIndexService() {
        return indexService;
    }

    public void setIndexService(IIndexService indexService) {
        this.indexService = indexService;
    }

    /**
     * 首页数据显示
     *
     * @return
     */
    public String showInfoToIndex() {

        /**
         * 方法中需要查询三个类型数据
         *      1.首页汽车轮播
         *      2.关于我们
         *      3.汽车保养
         *      4.服务类型
         *      5.配件产品
         */
//        首页汽车轮播
        List<Servicecar> seCarList = indexService.listServiceCar();
//        关于我们
        Company company = indexService.queryCom(1);
//        汽车保养
        List<Servicesmall> seSmallList = indexService.serviceSmallList();
//        配件产品
        List<Stock> stockList = indexService.queryStock();

        ActionContext.getContext().put("seCarList",seCarList);
        ActionContext.getContext().put("company",company);
        ActionContext.getContext().put("seSmallList",seSmallList);
        ActionContext.getContext().put("stockList",stockList);

        return "showInfoToIndex";
        }

        }
