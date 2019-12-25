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
                href="#">汽车类型</a>&nbsp;-</span>&nbsp;编辑
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/serviceCar_updateSavePerEnt.action" enctype="multipart/form-data" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>汽车类型修改</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        <input type="hidden" value="${retServiceCarEnt.vehicleId}" name="ServiceCarEnt.vehicleId"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;头像：
                        <div class="vipHead vipHead1">
                            <img src="${pageContext.request.contextPath}/upFile/${retServiceCarEnt.vehicleImg}" />
                            <input type="hidden" value="${retServiceCarEnt.vehicleImg}" name="ServiceCarEnt.vehicleImg"/>
                            <p class="vipP">添加商品</p>
                            <input class="file1" type="file" name="upload"/>
                        </div>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;车辆类型：<input type="text" value="${retServiceCarEnt.vehicleName}" class="input3" name="serviceCarEnt.vehicleName"/>

                    <div class="bbD">
                        <p class="bbDP">
                            <input class="btn_yes btn_ok" type="submit" value="提交">

                        </p>
                    </div>
                </div>
            </div>
            </div>
        </form>

        <!-- 上传广告页面样式end -->
    </div>
</div>
</body>
</html>