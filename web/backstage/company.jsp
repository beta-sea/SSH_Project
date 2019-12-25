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
    <title>服务类型-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/page.js" ></script> -->
</head>

<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;-</span>&nbsp;服务类型
        </div>
    </div>

    <div class="page">
        <!-- user页面样式 -->
        <div class="connoisseur">
            <div class="conform">


            </div>
            <!-- user 表格 显示 -->
            <div class="conShow">
                <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="66px" class="tdColor">公司名称</td>
                        <td width="100px" class="tdColor">公司地址</td>
                        <td width="66px" class="tdColor">公司手机</td>
                        <td width="130px" class="tdColor">公司电话</td>
                        <td width="130px" class="tdColor">QQ</td>
                        <%--                        <td width="180px" class="tdColor">添加事件</td>--%>
                        <td width="130px" class="tdColor">联系人</td>
                        <td width="130px" class="tdColor">邮箱</td>
                        <td width="130px" class="tdColor">邮编</td>
                        <td width="130px" class="tdColor">公司简介</td>


                    </tr>

                    <%--                    便利结果集--%>
                    <c:forEach items="${pg.list}" var="item" varStatus="index">
                        <tr height="40px">

                            <td>${item.companyName}</td>
                            <td>${item.companyAddress}</td>
                            <td>${item.phone}</td>
                            <td>${item.tel}</td>
                            <td>${item.qq}</td>
                            <td>${item.contacts}</td>
                            <td>${item.mail}</td>
                            <td>${item.zipCode}</td>
                            <td>${item.companySynopsis}</td>
                                <%--                            <td>${item.createtime}</td>--%>

                        </tr>
                    </c:forEach>

                </table>
                <div class="cfD">
                    <button class="userbtn" type="submit" onclick="updateCompany()">修改信息</button>



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


    function updateCompany() {
        window.location.href = "${pageContext.request.contextPath}/company_queryById.action?companyEnt.id=1";

    }
    // 广告弹出框 end
</script>
</html>