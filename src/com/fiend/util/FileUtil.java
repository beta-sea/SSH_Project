package com.fiend.util;

import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
    public static void saveFile(String uploadFileName,File upload ) throws IOException {
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
    }


    public static boolean deleteImg(String pathname){
        boolean result = false;
        File file = new File(pathname);
        if (file.exists()) {
            file.delete();
            result = true;
        }

        return result;

    }
}
