<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/20
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>登录-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/public.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/page.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/public.js"></script>
</head>
<body>

<!-- 登录页面头部 -->
<div class="logHead">
    <img src="${pageContext.request.contextPath}/backstage/img/logLOGO.png"/>
</div>
<!-- 登录页面头部结束 -->

<!-- 登录body -->
<div class="logDiv">
    <form action="${pageContext.request.contextPath}/staff_loginAdmin.action" method="post">
        <img class="logBanner" src="${pageContext.request.contextPath}/backstage/img/logBanner.png"/>
        <div class="logGet">
            <!-- 头部提示信息 -->
            <div class="logD logDtip">
                <p class="p1">登录</p>
                <p class="p2">有点人员登录</p>
            </div>
            <!-- 输入框 -->
            <div class="lgD">
                <img class="img1" src="${pageContext.request.contextPath}/backstage/img/logName.png"/>
                <input type="text" name="adminEnt.loginName" placeholder="输入用户名" value="刘小邦"/>
            </div>
            <div class="lgD">
                <img class="img1" src="${pageContext.request.contextPath}/backstage/img/logPwd.png"/>
                <input type="password" name="adminEnt.loginPwd" placeholder="输入用户密码" value="000000"/>
            </div>
            <div class="lgD logD2">
                <input class="getYZM" type="text"/>
                <div class="logYZM">
                    <img class="yzm" src="${pageContext.request.contextPath}/backstage/img/logYZM.png"/>
                </div>
            </div>
            <div class="logC">
                <button>登 录</button>
            </div>
        </div>
    </form>
</div>
<!-- 登录body  end -->

<!-- 登录页面底部 -->
<div class="logFoot">
    <p class="p1">版权所有：重庆德克特科技有限公司</p>
    <p class="p2">重庆德克特科技有限公司 登记序号：渝ICP备11003578号-2</p>
</div>
<!-- 登录页面底部end -->
</body>
</html>