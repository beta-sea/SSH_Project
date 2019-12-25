package com.fiend.service.impl;

import com.fiend.dao.ILeavingDao;
import com.fiend.entity.Leaving;
import com.fiend.service.ILeavingService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class LeavingServiceImpl implements ILeavingService {

    private ILeavingDao leavingDao;

    public ILeavingDao getLeavingDao() {
        return leavingDao;
    }
    public void setLeavingDao(ILeavingDao leavingDao) {
        this.leavingDao = leavingDao;
    }

    @Override
    public boolean addLeaving(Leaving leavingEnt) {
        return leavingDao.addLeaving(leavingEnt);
    }

    @Override
    public boolean updateLeaving(Leaving leavingEnt) {
        return leavingDao.updateLeaving(leavingEnt);
    }

    @Override
    public boolean deleteLeaving(int leavingId) {
        return leavingDao.deleteLeaving(leavingId);
    }

    @Override
    public Leaving queryById(Leaving leavingEnt, int id) {
        return leavingDao.queryById(leavingEnt,id);
    }

    @Override
    public List<Leaving> queryByLeavingList() {
        //查询语句拼写
        String hql = "from Leaving";
        List<Leaving> list = leavingDao.queryByLeavingList(hql);
        return list;
    }

    @Override
    public List<Leaving> queryByMessageUser(Leaving leavingEnt) {
        //定义查询hql语句
        String hql = "from Leaving where name like ?";
        //调用查询方法
        List<Leaving> list = leavingDao.queryByMessageUser(hql, leavingEnt);
        return list;
    }

    @Override
    public PageModel<Leaving> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Leaving> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Leaving where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from Leaving");

        //查询
        List<Leaving> pageList = leavingDao.queryPageList(hql.toString());
        int totalNum = leavingDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }
}
