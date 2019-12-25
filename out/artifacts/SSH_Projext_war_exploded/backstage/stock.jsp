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
    <title>员工管理-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;管理员管理
        </div>
    </div>

    <div class="page">
        <!-- user页面样式 -->
        <div class="connoisseur">
            <div class="conform">
                <div class="cfD">
                    <button class="userbtn" type="submit" onclick="addStock()">添加</button>
                </div>
                <!-- user 表格 显示 -->
                <div class="conShow">
                    <table border="1" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="66px" class="tdColor tdC">序号</td>
                            <td width="100px" class="tdColor">配件名</td>
                            <td width="66px" class="tdColor">品牌</td>
                            <td width="130px" class="tdColor">进价</td>
                            <td width="130px" class="tdColor">图片</td>
                            <td width="130px" class="tdColor">车型</td>
                            <td width="130px" class="tdColor">车型号</td>
                            <td width="130px" class="tdColor">售价</td>
                            <td width="130px" class="tdColor">作用</td>
                            <td width="130px" class="tdColor">数量</td>
                            <td width="130px" class="tdColor">操作</td>
                        </tr>
                        <%--                    便利结果集--%>
                        <c:forEach items="${pg.list}" var="item" varStatus="index">
                            <tr height="40px">
                                <td>${strNo.index+1}</td>
                                <td>${item.fittingName}</td>
                                <td>${item.brand}</td>
                                <td>${item.purchasePrice}</td>
                                <td><img src="${pageContext.request.contextPath}/upFile/${item.img}" width="100px" height="100px"></td>
                                <td>${item.vehicleType}</td>
                                <td>${item.vehicleNumber}</td>
                                <td>${item.price}</td>
                                <td>${item.functions}</td>
                                <td>${item.number}</td>
                                    <%--                            <td>${item.createtime}</td>--%>
                                <td>
                                    <img class="operation delban" alt="${item.fittingId}"
                                         src="${pageContext.request.contextPath}/backstage/img/delete.png">
                                </td>
                            </tr>
                        </c:forEach>

                    </table>
                    <div class="paging">
                        <span>总页数:${pg.totalPages}</span>/<span>当前页:${pg.pageNo}</span>
                        <a class="a"
                           href="${pageContext.request.contextPath}/stock_queryPageStockList.action?map.pageNo=1&map.pageSize=10">首页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/stock_queryPageStockList.action?map.pageNo=${pg.pageNo-1 > 0 ? (pg.pageNo-1) : 1}&map.pageSize=10">上一页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/stock_queryPageStockList.action?map.pageNo=${pg.pageNo+1 > pg.totalPages ? pg.totalPages : (pg.pageNo+1)}&map.pageSize=10">下一页</a>
                        <a class="a"
                           href="${pageContext.request.contextPath}/stock_queryPageStockList.action?map.pageNo=${pg.totalPages}&map.pageSize=10">尾页</a>
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
    function addStock() {
        window.location.href = "${pageContext.request.contextPath}/stock_showSaveStock.action";
    }

    //执行删除方法
    function deleteData() {
        window.location.href = "${pageContext.request.contextPath}/stock_deleteStockEnt.action?stockEnt.fittingId=" + $('#herfId').attr('target');
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