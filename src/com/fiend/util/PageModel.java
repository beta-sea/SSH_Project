package com.fiend.util;

import java.util.List;
import java.util.Map;

/**
 * 分页
 */
public class PageModel<T> {

    //定义分页需要的属性
    private int pageNo;     //当前页数
    private int pageSize;   //每页显示条数
    private int totalCount; //  数据总条数
    private int totalPages; //总页数

    //返回集合
    private List<T> list = null;
    //传递参数
    private Map<String, Object> map;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 根据总条数计算总页数
     *
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {

        this.totalPages = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            this.totalPages += 1;
        }

        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
