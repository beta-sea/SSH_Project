<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/12/4
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入核心标签库jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>车型服务-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;车型服务
        </div>
    </div>

    <div class="page">
        <!-- user页面样式 -->
        <div class="connoisseur">
            <div class="conform">
                <div class="cfD">
                    <button class="userbtn" type="submit" onclick="addCarService()">添加</button>
                </div>
                <!-- user 表格 显示 -->
                <div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                        <tr>

                            <td width="400px" class="tdColor">车型名称</td>
                            <td width="600px" class="tdColor">车型图片</td>
                            <td width="130px" class="tdColor">操作</td>
                        </tr>
                        <%--                    便利结果集--%>
                        <c:forEach items="${pg.list}" var="item" varStatus="index">
                            <tr height="40px">
                                <td><img src="${pageContext.request.contextPath}/upFile/${item.vehicleImg}" width="100px" height="100px"></td>
                                <td>${item.vehicleName}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/serviceCar_queryById.action?serviceCarEnt.vehicleId=${item.vehicleId}">
                                        <img class="operation"
                                             src="${pageContext.request.contextPath}/backstage/img/update.png">
                                    </a>
                                    <img class="operation delban" alt="${item.vehicleId}"
                                         src="${pageContext.request.contextPath}/backstage/img/delete.png">
                                </td>
                                    <%--                            <td>${item.createtime}</td>--%>

                        </c:forEach>

                    </table>
                    <div class="paging">
                        <span>总页数:${pg.totalPages}</span>/<span>当前页:${pg.pageNo}</span>
                        <a class="a"
                           href="${pageContext.request.contextPath}/serviceCar_queryPageServiceCarList.action?map.pageNo=1&map.pageSize=10">首页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/serviceCar_queryPageServiceCarList.action?map.pageNo=${pg.pageNo-1 > 0 ? (pg.pageNo-1) : 1}&map.pageSize=10">上一页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/serviceCar_queryPageServiceCarList.action?map.pageNo=${pg.pageNo+1 > pg.totalPages ? pg.totalPages : (pg.pageNo+1)}&map.pageSize=10">下一页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/serviceCar_queryPageServiceCarList.action?map.pageNo=${pg.totalPages}&map.pageSize=10">尾页</a>
                    </div>
                    <div class="conform">
                        <form action="${pageContext.request.contextPath}/serviceCar_queryByName.action" method="post">
                            <div class="cfD">
                                <input class="userinput" type="text" name="serviceCarEnt.vehicleName" placeholder="输入服务名称"
                                       value="${serviceCarEnt.vehicleName}"/>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <button class="userbtn" type="submit">检索</button>
                            </div>
                        </form>

                    </div>
                </div>
                <!-- user 表格 显示 end-->
            </div>
            <!-- user页面样式end -->
        </div>

    </div>


    <!-- 删除弹出框 -->
    <div class="banDel">
        <div class="delete">
            <div class="close">
                <a><img src="${pageContext.request.contextPath}/backstage/img/shanchu.png"/></a>
            </div>
            <p class="delP1">你确定要删除此条记录吗？</p>
            <p class="delP2">
                <a id="herfId" onclick="deleteData()" target="" class="ok yes">确定</a><a class="ok no">取消</a>
            </p>
        </div>
    </div>
    <!-- 删除弹出框  end-->
</div>
</body>

<script type="text/javascript">

    //执行添加方法
    function addCarService() {
        window.location.href = "${pageContext.request.contextPath}/serviceCar_showSaveServiceCar.action";
    }

    //执行删除方法
    function deleteData() {
        window.location.href = "${pageContext.request.contextPath}/serviceCar_deleteServiceCarEnt.action?serviceCarEnt.vehicleId=" + $('#herfId').attr('target');
    }

    // 广告弹出框
    $(".delban").click(function () {
        var userId = $(this).attr('alt');
        $('#herfId').attr('target', userId);
        $(".banDel").show();
    });
    $(".close").click(function () {
        $(".banDel").hide();
    });
    $(".no").click(function () {
        $(".banDel").hide();
    });
    // 广告弹出框 end
</script>
</html>