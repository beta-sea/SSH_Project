<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/20
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>首页-有点</title>
</head>
<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
          frameborder="no" border="0">
    <frame src="${pageContext.request.contextPath}/backstage/inc/head.jsp"
           name="headmenu" id="mainFrame" title="mainFrame"><!-- 引用头部 -->
    <!-- 引用左边和主体部分 -->
    <frameset rows="100*" cols="220,*" scrolling="No"
              framespacing="0" frameborder="no" border="0">
        <frame
                src="${pageContext.request.contextPath}/backstage/inc/left.jsp" name="leftmenu" id="mainFrame" title="mainFrame">
        <frame src="${pageContext.request.contextPath}/backstage/main.jsp" name="main" scrolling="yes" noresize="noresize"
               id="rightFrame" title="rightFrame">
    </frameset>
</frameset>
</html>