<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/22
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>头部-有点</title>
    <link rel="stylesheet" type="text/css" href="../css/public.css"/>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/public.js"></script>
</head>

<body>
<!-- 头部 -->
<div class="head">
    <div class="headL">
        <img class="headLogo" src="../img/headLogo.png"/>
    </div>
    <div class="headR">
        <p class="p1">
            欢迎,<span>${adEnt.userName}</span>登录系统
        </p>
        <p class="p2">
            <a href="#" class="resetPWD">重置密码</a>&nbsp;&nbsp;<a
                href="{:U('Admin/Index/exit')}" class="goOut">退出</a>
        </p>
    </div>
    <!-- onclick="{if(confirm(&quot;确定退出吗&quot;)){return true;}return false;}" -->
</div>

<div class="closeOut">
    <div class="coDiv">
        <p class="p1">
            <span>X</span>
        </p>
        <p class="p2">确定退出当前用户？</p>
        <P class="p3">
            <a class="ok yes" href="${pageContext.request.contextPath}">确定</a><a class="ok no" href="#">取消</a>
        </p>
    </div>
</div>


</body>
</html>