<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/20
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入核心标签库jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>预约管理-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;预约管理
        </div>
    </div>

    <div class="page">
        <!-- user页面样式 -->
        <div class="connoisseur">
            <div class="conform">
                <form action="${pageContext.request.contextPath}/appointment_queryByName.action" method="post">
                    <div class="cfD">
                        <input class="userinput" type="text" name="appointmentEnt.customerName" placeholder="输入客户名"
                               value="${appointmentEnt.customerName}"/>
                        &nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;

                        <button class="userbtn" type="submit">检索</button>
                    </div>
                </form>

            </div>
            <!-- user 表格 显示 -->
            <div class="conShow">
                <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="66px" class="tdColor tdC">用户ID</td>
                        <td width="100px" class="tdColor">客户名</td>
                        <td width="66px" class="tdColor">性别</td>
                        <td width="130px" class="tdColor">车牌号</td>
                        <td width="130px" class="tdColor">车型ID</td>
                        <%--                        <td width="180px" class="tdColor">添加事件</td>--%>
                        <td width="130px" class="tdColor">手机号</td>
                        <td width="130px" class="tdColor">预约时间</td>
                        <td width="130px" class="tdColor">服务类型ID</td>
                        <td width="130px" class="tdColor">操作</td>
                    </tr>

                    <%--                    便利结果集--%>
                    <c:forEach items="${pg.list}" var="item" varStatus="index">
                        <tr height="40px">
                            <td>${strNo.index+1}</td>
                            <td>${item.customerName}</td>
                            <td>${item.sex}</td>
                            <td>${item.carNumber}</td>
                            <td>${item.vehicleId}</td>
                            <td>${item.tel}</td>
                            <td>${item.appointmentTime}</td>
                            <td>${item.serviceSmallId}</td>
                                <%--                            <td>${item.createtime}</td>--%>
                            <td>
                                <a href="${pageContext.request.contextPath}/appointment_queryById.action?appointmentEnt.userId=${item.userId}">
                                    <img class="operation"
                                         src="${pageContext.request.contextPath}/backstage/img/update.png">
                                </a>
                                <img class="operation delban" alt="${item.userId}"
                                     src="${pageContext.request.contextPath}/backstage/img/delete.png">
                            </td>
                        </tr>
                    </c:forEach>

                </table>
                <div class="cfD">
                    <button class="userbtn" type="submit" onclick="addAppointment()">添加服务</button>



                </div>
                <div class="paging">
                    <span>总页数:${pg.totalPages}</span>/<span>当前页:${pg.pageNo}</span>
                    <a class="a"
                       href="${pageContext.request.contextPath}/appointment_queryPageList.action?pageNo=1&pageSize=10">首页</a>
                    <a class="a"
                       href="${pageContext.request.contextPath}/appointment_queryPageList.action?pageNo=${pg.pageNo-1 > 0 ? (pg.pageNo-1) : 1}&pageSize=10">上一页</a>
                    <a class="a"
                       href="${pageContext.request.contextPath}/appointment_queryPageList.action?pageNo=${pg.pageNo+1 > pg.totalPages ? pg.totalPages : (pg.pageNo+1)}&pageSize=10">下一页</a>
                    <a class="a"
                       href="${pageContext.request.contextPath}/appointment_queryPageList.action?pageNo=${pg.totalPages}&pageSize=10">尾页</a>

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
</body>

<script type="text/javascript">

    //执行删除方法
    function deleteData() {
        window.location.href = "${pageContext.request.contextPath}/appointment_deleteAppointmentEnt.action?appointmentEnt.userId=" + $('#herfId').attr('target');
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


    function addAppointment() {
        window.location.href = "${pageContext.request.contextPath}/appointment_turnToPageAdd.action"

    }
    // 广告弹出框 end
</script>
</html>