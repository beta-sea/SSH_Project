<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/22
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>首页左侧导航</title>
    <link rel="stylesheet" type="text/css" href="../css/public.css"/>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/public.js"></script>
    <head></head>

<body id="bg">
<!-- 左边节点 -->
<div class="container">

    <div class="leftsidebar_box">
        <a href="../main.html" target="main">
            <div class="line">
                <img src="../img/coin01.png"/>&nbsp;&nbsp;首页
            </div>
        </a>
        <!-- <dl class="system_log">
        <dt><img class="icon1" src="../img/coin01.png" /><img class="icon2"src="../img/coin02.png" />
            首页<img class="icon3" src="../img/coin19.png" /><img class="icon4" src="../img/coin20.png" /></dt>
    </dl> -->
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin03.png"/>
                <img class="icon2" src="../img/coin04.png"/> 人员管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a class="cks" href="${pageContext.request.contextPath}/staff_queryPageList.action?pageNo=1&pageSize=10" target="main">员工管理</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a class="cks" href="${pageContext.request.contextPath}/storage_queryPageList.action?map.pageNo=1&map.pageSize=10" target="main">部门管理</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin05.png"/>
                <img class="icon2" src="../img/coin06.png"/> 库存管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a class="cks" href="${pageContext.request.contextPath}/stock_queryPageStockList.action?map.pageNo=1&map.pageSize=10" target="main">库存清单</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>

        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin07.png"/>
                <img class="icon2" src="../img/coin08.png"/> 服务类型
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/serviceSmall_queryPageList.action?pageNo=1&pageSize=10" target="main" class="cks">服务类型</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/serviceCar_queryPageServiceCarList.action?map.pageNo=1&map.pageSize=10" target="main" class="cks">车型服务</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin10.png"/>
                <img class="icon2" src="../img/coin09.png"/> 订单管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/appointment_queryPageList.action?pageNo=1&pageSize=10" target="main" class="cks">预约管理</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/repair_queryPageList?pageNo=1&pageSize=10" target="main" class="cks">维修记录</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin11.png"/>
                <img class="icon2" src="../img/coin12.png"/> 招聘管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/post_queryPageList?pageNo=1&pageSize=10" target="main" class="cks">发布需求</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/recruit_queryPageList?pageNo=1&pageSize=10" target="main" class="cks">应聘管理</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin14.png"/>
                <img class="icon2" src="../img/coin13.png"/> 留言管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/leaving_queryPageLeavingList?map.pageNo=1&map.pageSize=10" target="main" class="cks">留言管理</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>
        <dl class="system_log">
            <dt>
                <img class="icon1" src="../img/coin14.png"/>
                <img class="icon2" src="../img/logName.png"/> 新闻管理
                <img class="icon3" src="../img/coin19.png"/>
                <img class="icon4" src="../img/coin20.png"/>
            </dt>
            <dd>
                <img class="coin11" src="../img/coin111.png"/>
                <img class="coin22" src="../img/coin222.png"/>
                <a href="${pageContext.request.contextPath}/news_queryPageList?pageNo=1&pageSize=10" target="main" class="cks">新闻</a>
                <img class="icon5" src="../img/coin21.png"/>
            </dd>
        </dl>


    </div>

</div>
</body>
</html>