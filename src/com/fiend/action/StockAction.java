package com.fiend.action;

import com.fiend.entity.Stock;
import com.fiend.service.IStockService;
import com.fiend.util.PageModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StockAction extends ActionSupport {

    private Stock stockEnt;
    private Map<String, Object> map = new HashMap<>();
    //文件上传参数
    private File upload;
    //文件名称 struts2 规定 命名格式 xxxFileName
    private String uploadFileName;
    //文件类型 struts2 规定 命名格式 xxxContentType
    private String uploadContentType;

    private IStockService stockService;


    /**
     * 分页
     *
     * @return
     */
    public String queryPageStockList() {
        //调用service中分页方法
        PageModel<Stock> pg = stockService.queryPageList(map);
        //存入作用域
        ActionContext.getContext().put("pg", pg);

        return "queryPageStockList";
    }

    /**
     * 删除
     *
     * @return
     */
    public String deleteStockEnt() {

        boolean bool = stockService.deleteStock(stockEnt.getFittingId());

        if (bool) {
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageStockList();
            return "caseDateSuccess";
        } else {
            return "caseDateError";
        }
    }

    /**
     * 添加页面
     * @return
     */
    public String showSaveStock(){
        return "showAddStock";
    }

    /**
     * 添加
     * @return
     * @throws IOException
     */
    public String addStockEnt() throws IOException {

        //获取上传文件路径
        String path = ServletActionContext.getServletContext().getRealPath("/");
        //创建存放文件夹
        File file = new File(path + "upFile/");
        //判断文件夹是否存在
        if (!file.exists() && !file.isDirectory()) {
            //创建
            file.mkdir();
        }

        //定义文件流输出位置
        FileOutputStream fos = new FileOutputStream(file + "/" + uploadFileName);

        //定义文件流的读入类
        FileInputStream fin = new FileInputStream(upload);

        //开始读写操作
        byte[] bt = new byte[1024];
        //每次读取长度
        int len = 0;
        while ((len = fin.read(bt)) > 0) {
            fos.write(bt, 0, len);
        }
        //关闭流
        fin.close();
        fos.close();

        //保存数据
        stockEnt.setImg(uploadFileName);
        boolean bool = stockService.addStock(stockEnt);
        if (bool){
            map.put("pageNo",1);
            map.put("pageSize",10);
            this.queryPageStockList();
            return "addStockEnt";
        } else {
            return "errorInfo";
        }

    }

    public Stock getStockEnt() {
        return stockEnt;
    }

    public void setStockEnt(Stock stockEnt) {
        this.stockEnt = stockEnt;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public IStockService getStockService() {
        return stockService;
    }

    public void setStockService(IStockService stockService) {
        this.stockService = stockService;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
}
