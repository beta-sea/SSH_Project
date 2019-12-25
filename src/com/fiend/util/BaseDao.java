package com.fiend.util;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.management.Query;
import java.util.List;

/**
 * 数据库连接基类
 *
 * @author JAVA
 */
public class BaseDao extends HibernateTemplate {
    /**
     * 查询 数据列表
     *
     * @param sql
     * @return
     */
    public List commonQuery(String sql) {
        List<Object> objectList = (List<Object>) super.find(sql);
        return objectList;
    }

    /**
     * 条件查询
     * @param hql
     * @param val
     * @return
     */
    public List commonQueryByName(String hql, Object... val) {
        List<Object> objectList = (List<Object>) super.find(hql, val);
        return objectList;
    }

    public List commonQueryPage(String sql,Object... val){

        return null;
    }

    /**
     * 查询某个对象
     * @param obj
     * @param id
     * @return
     */
    public Object commonGetObj(Object obj,int id){
        Object objEmnt = super.get(obj.getClass(),id);
        return objEmnt;
    }

    /**
     * 保存或修改对象
     * @param obj
     * @return
     */
    public boolean commonSaveOrUpdate(Object obj){
        boolean bool = false;

        try {
            super.save(obj);
            bool = true;
        } catch (Exception e){
            bool = false;
        }

        return  bool;
    }

    /**
     * 删除对象
     * @param obj
     * @return
     */
    public boolean commonDelete(Object obj){
        boolean bool = false;

        try {
            super.delete(obj);
            bool = true;
        } catch (Exception e){
            bool = false;
        }

        return  bool;
    }

}
