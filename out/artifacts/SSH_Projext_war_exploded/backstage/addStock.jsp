<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/20
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>添加库存商品-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;<a
                href="#">公共管理</a>&nbsp;-</span>&nbsp;库存商品
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/stock_addStockEnt.action" enctype="multipart/form-data" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>商品库存添加</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;头像：
                        <div class="vipHead vipHead1">
                            <img src="img/userPICS.png"/>
                            <p class="vipP">添加商品</p>
                            <input class="file1" type="file" name="upload"/>
                        </div>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;配件名称：<input type="text" class="input3" name="stockEnt.fittingName"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;品牌：<input type="text" class="input3" name="stockEnt.brand"/>

                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;进价：<input type="text" class="input3" name="stockEnt.purchasePrice"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;车型：<input type="text" class="input3" name="stockEnt.vehicleType"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;车型号：<input type="text" class="input3" name="stockEnt.vehicleNumber"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;售价：<input type="text" class="input3" name="stockEnt.price"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作用：<input type="text" class="input3" name="stockEnt.functions"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数量：<input type="text" class="input3" name="stockEnt.number"/>
                    </div>
                    <div class="bbD">
                        <p class="bbDP">
                            <input class="btn_yes btn_ok" type="submit" value="提交">
                            <a class="btn_ok btn_no" href="#">取消</a>
                        </p>
                    </div>
                </div>
            </div>
        </form>
        <!-- 上传广告页面样式end -->
    </div>
</div>
</body>
</html>