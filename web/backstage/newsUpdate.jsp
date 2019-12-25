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
                href="#">新闻管理</a>&nbsp;-</span>&nbsp;新闻更新
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/news_updateSavePerEnt.action" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>行家编辑</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        <input type="hidden"value="${retNewsEnt.id}" name="NewsEnt.id"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新闻标题：<input type="text" class="input3" value="${retNewsEnt.title}" name="newsEnt.title"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;正文：<input type="text" class="input3" value="${retNewsEnt.content}" name="NewsEnt.content"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：<input type="text" class="input3" value="${retNewsEnt.newstime}" name="NewsEnt.newstime"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;员工ID：<input type="text" class="input3" value="${retNewsEnt.staffId}" name="NewsEnt.staffId"/>
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