package com.fiend.service.impl;

import com.fiend.dao.ICompanyDao;
import com.fiend.entity.Company;
import com.fiend.service.ICompanyService;
import com.fiend.util.PageModel;

import java.util.List;
import java.util.Map;

public class CompanyServiceImpl implements ICompanyService {
    private ICompanyDao companyDao;

    public ICompanyDao getCompanyDao() {
        return companyDao;
    }

    public void setCompanyDao(ICompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public boolean updateCompany(Company companyEnt) {
        return companyDao.updateCompany(companyEnt);
    }

    @Override
    public List<Company> queryCompanyList() {
        String sql = "from company";
        return companyDao.queryByPerList(sql);
    }

    @Override
    public Company queryById(int id) {
        return companyDao.queryById(new Company(),id);
    }

    @Override
    public PageModel<Company> queryPageList(Map<String, Object> map) {
        PageModel<Company> pg = new PageModel<>();
        //调用列表+总条数 方法查询 将结果放到 pg
        int pageNo = (int) map.get("pageNo");
        int pageSize = (int) map.get("pageSize");
        //计算查询位置
        int beginNum = (pageNo - 1) * pageSize;
        //拼接hql语句
        StringBuffer hql = new StringBuffer("select * from company where 1=1 limit " + beginNum + "," + pageSize);

        StringBuffer hqlCount = new StringBuffer("select count(id) as counNum from company");

        //查询
        List<Company> pageList = companyDao.queryPageList(hql.toString());
        int totalNum = companyDao.queryPageCount(hqlCount.toString());

        //存入返回对象 pg
        pg.setList(pageList);
        //存入总条数 自动计算总页数
        pg.setPageNo(beginNum);
        pg.setPageSize(pageSize);
        pg.setTotalCount(totalNum);

        return pg;
    }
}
