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
    <title>行家编辑-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;<a
                href="#">维修服务</a>&nbsp;-</span>&nbsp;编辑维修
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/repair_updateSavePerEnt.action" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>行家编辑</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        <input type="hidden"value="${retRepairEnt.id}" name="RepairEnt.id"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客户ID：<input type="text" class="input3" value="${retRepairEnt.customerId}" name="RepairEnt.customerId"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务时间：<input type="text" class="input3" value="${retRepairEnt.serviceTime}" name="RepairEnt.serviceTime"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务时长：<input type="text" class="input3" value="${retRepairEnt.lengthService}" name="RepairEnt.lengthService"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务人员ID：<input type="text" class="input3" value="${retRepairEnt.staffId}" name="RepairEnt.staffId"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;费用：<input type="text" class="input3" value="${retRepairEnt.cost}" name="RepairEnt.cost"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;提车时间：<input type="text" class="input3" value="${retRepairEnt.deliveryTime}" name="RepairEnt.deliveryTime"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务类型ID：<input type="text" class="input3" value="${retRepairEnt.serviceSmallId}" name="RepairEnt.serviceSmallId"/>
                    </div>

                    <div class="bbD">
                        <p class="bbDP">
                            <input class="btn_yes btn_ok" type="submit" value="提交">

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