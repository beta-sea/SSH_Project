package com.fiend.dao.impl;

import com.fiend.dao.IRecruitDao;
import com.fiend.entity.Recruit;
import com.fiend.util.BaseDao;

import java.util.List;

public class RecruitDaoImpl extends BaseDao implements IRecruitDao {

    @Override
    public boolean addRecruit(Recruit recruitEnt) {
        //调用公共类的添加方法
        boolean bool = super.commonSaveOrUpdate((recruitEnt));
        return bool;
    }

    @Override
    public boolean updateRecruit(Recruit recruitEnt) {
        //调用公共类修改方法
        super.update(recruitEnt);
        return true;
    }

    @Override
    public boolean deleteRecruit(int recruitId) {
        Recruit recruitEnt = (Recruit) super.commonGetObj(new Recruit(), recruitId);
        //调用公共类的删除方法
        boolean bool = super.commonDelete(recruitEnt);
        return bool;
    }

    @Override
    public Recruit queryById(Recruit recruitEnt, int id) {
        //调用公共类查询方法
        Recruit recruit = (Recruit) super.commonGetObj(recruitEnt, id);
        return recruit;
    }

    @Override
    public List<Recruit> queryByPerList(String hql) {
        //查询所有数据集合
        List<Recruit> list = super.commonQuery(hql);
        return list;
    }

    @Override
    public List<Recruit> queryByPageList(String hql, Object... objects) {
        //调用分页工具 进行分页
        List<Recruit> list = super.getSessionFactory()
                .getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Recruit.class)
                .list();
        return list;
    }

    @Override
    public int queryPageCount(String hql, Object... objects) {
        //分页总条数
        Object obj = super.getSessionFactory()
                .getCurrentSession()
                .createSQLQuery(hql)
                .uniqueResult();
        return Integer.parseInt(obj.toString());
    }

    @Override
    public List<Recruit> queryByNameAndSex(String hql) {
        List<Recruit> list = super.getSessionFactory().getCurrentSession()
                .createSQLQuery(hql)
                .addEntity(Recruit.class)
                .list();
        return list;
    }
}
