package com.fiend.service.impl;

import com.fiend.dao.IRepairDao;
import com.fiend.entity.Repair;
import com.fiend.service.IRepairService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class RepairServiceImpl implements IRepairService {
    private IRepairDao repairDao;



    @Override
    public boolean addRepair(Repair repairEnt) {
        return repairDao.addRepair(repairEnt);
    }

    @Override
    public boolean updateRepair(Repair repairEnt) {
        return repairDao.updateRepair(repairEnt);
    }

    @Override
    public List<Repair> queryRepairList() {
        String hql = "from Repair";

        return repairDao.queryByPerList(hql);
    }

    @Override
    public Repair queryById(int id) {
        Repair repairEnt = repairDao.queryById(new Repair(),id);
        return repairEnt;
    }

    @Override
    public boolean deleteRepair(int id) {
        return repairDao.deleteRepair(id);
    }

    @Override
    public PageModel<Repair> queryPageList(Map<String, Object> map) {
        PageModel<Repair> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Repair where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from Repair");

        //查询
        List<Repair> pageList = repairDao.queryPageList(hql.toString());
        int totalNum = repairDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }

    @Override
    public PageModel<Repair> queryByName(Repair repairEnt, Map<String, Object> map) {
        PageModel<Repair> pg = new PageModel<>();
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        int beginNum = (pageNo - 1) * pageSize;
        String name = "'%"+repairEnt.getCustomerId()+"%'";
        StringBuffer hql = new StringBuffer("select * from repair where customerId like "+ name + " limit "+ beginNum +","+pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as countNum from repair where customerId like "+name);
        List<Repair> serviceSmallList = repairDao.queryByName(hql.toString());
        int totalNum = repairDao.queryPageCount(hqlCount.toString());
        pg.setList(serviceSmallList);
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }










    public IRepairDao getRepairDao() {
        return repairDao;
    }

    public void setRepairDao(IRepairDao repairDao) {
        this.repairDao = repairDao;
    }
}
