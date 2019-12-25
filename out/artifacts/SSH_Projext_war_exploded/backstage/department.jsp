<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/26
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入核心标签库jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>部门管理-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;人员管理-部门管理
        </div>
    </div>

    <div class="page">
        <!-- user页面样式 -->
        <div class="connoisseur">
            <div class="conform">
                <form action="${pageContext.request.contextPath}/department_queryDepartmentByName.action" method="post">
                    <div class="cfD">
                        <input class="userinput" type="text" name="posEnt.name" placeholder="输入部门名"
                               value="${depEnt.name}"/>
                        &nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
                        <button class="userbtn" type="submit">检索</button>
                    </div>
                </form>
            </div>
            <!-- user 表格 显示 -->
            <div class="conShow">
                <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="66px" class="tdColor tdC">序号</td>
                        <td width="100px" class="tdColor">组长姓名</td>
                        <td width="66px" class="tdColor">性别</td>
                        <td width="130px" class="tdColor">操作</td>
                    </tr>

                    <%--                    便利结果集--%>
                    <c:forEach items="${list}" var="item" varStatus="index">
                        <tr height="40px">
                            <td>${strNo.index+1}</td>
                            <td>${item.dName}</td>
                            <td>${item.dSex}</td>
                            <td>
                                <a href="connoisseuradd.html">
                                    <img class="operation"
                                         src="${pageContext.request.contextPath}/backstage/img/update.png">
                                </a>
                                <img class="operation delban"
                                     src="${pageContext.request.contextPath}/backstage/img/delete.png">
                            </td>
                        </tr>
                    </c:forEach>

                </table>
                <div class="paging">此处是分页</div>
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
            <a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
        </p>
    </div>
</div>
<!-- 删除弹出框  end-->
</body>

<script type="text/javascript">
    // 广告弹出框
    $(".delban").click(function () {
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