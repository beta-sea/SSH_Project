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
                href="#">新闻管理</a>&nbsp;-</span>&nbsp;添加新闻
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/news_addNewsEnt.action" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>服务类型添加</span>
                </div>
                <div class="baBody">
                    <div class="bbD">

                        <div class="vipHead vipHead1">


                        </div>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新闻标题：<input type="text" class="input3" name="newsEnt.title"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新闻正文：<input type="text" class="input3" name="newsEnt.content"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：<input type="text" class="input3" name="newsEnt.newstime"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工编号：<input type="text" class="input3" name="newsEnt.staffId"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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