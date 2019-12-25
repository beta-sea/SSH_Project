package com.fiend.service.impl;

import com.fiend.dao.IStorageDao;
import com.fiend.entity.Storage;
import com.fiend.service.IStorageService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class StorageServiceImpl implements IStorageService {

    private IStorageDao storageDao;

    public IStorageDao getStorageDao() {
        return storageDao;
    }

    public void setStorageDao(IStorageDao storageDao) {
        this.storageDao = storageDao;
    }

    /**
     * 增加
     * @param stoEnt
     * @return
     */
    @Override
    public boolean addSto(Storage stoEnt) {
        return storageDao.addSto(stoEnt);
    }

    /**
     * 修改
     * @param StoEnt
     * @return
     */
    @Override
    public boolean updateSto(Storage StoEnt) {
        return storageDao.updateSto(StoEnt);
    }

    /**
     * 删除
     * @param StorageId
     * @return
     */
    @Override
    public boolean deleteSto(int StorageId) {
        return storageDao.deleteSto(StorageId);
    }

    /**
     * id查询
     * @param id
     * @return
     */
    @Override
    public Storage queryById(int id) {
        return storageDao.queryById(new Storage(),id);
    }

    /**
     * 查询list
     * @return
     */
    @Override
    public List<Storage> queryByStoList() {
        //查询语句拼写
        String hql = "from Storage";
        List<Storage> list = storageDao.queryByStoList(hql);
        return list;
    }

    /**
     * 添加查询
     * @param StorageEnt
     * @return
     */
    @Override
    public List<Storage> queryByName(Storage StorageEnt) {
        //定义查询hql语句
        String hql = "from Storage where name like ?";
        //调用查询方法
        List<Storage> list = storageDao.queryByName(hql, StorageEnt);
        return list;
    }

    /**
     * 分页
     * @param map
     * @return
     */
    @Override
    public PageModel<Storage> queryPageList(Map<String, Object> map) {
        //定义返回对象
        PageModel<Storage> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        String[] arrNO = (String[]) map.get("pageNo");
        int pageNo = Integer.parseInt(arrNO[0]);
        String[] arrSize = (String[]) map.get("pageSize");
        int pageSize = Integer.parseInt(arrSize[0]);
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from Storage where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(storageId) as counNum from Storage");

        //查询
        List<Storage> pageList = storageDao.queryPageList(hql.toString());
        int totalNum = storageDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);
        return pg;
    }

}
