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
                href="#">公司信息编辑</a>&nbsp;</span>&nbsp;
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/company_updateSavePerEnt.action" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>公司信息编辑</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        <input type="hidden"value="${retCompanyEnt.id}" name="CompanyEnt.id"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;公司名称：<input type="text" class="input3" value="${retCompanyEnt.companyName}" name="CompanyEnt.companyName"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;公司地址：<input type="text" class="input3" value="${retCompanyEnt.companyAddress}" name="CompanyEnt.companyAddress"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机：<input type="text" class="input3" value="${retCompanyEnt.phone}" name="CompanyEnt.phone"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话：<input type="text" class="input3" value="${retCompanyEnt.tel}" name="CompanyEnt.tel"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ：<input type="text" class="input3" value="${retCompanyEnt.qq}" name="CompanyEnt.QQ"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;联系人：<input type="text" class="input3" value="${retCompanyEnt.contacts}" name="CompanyEnt.contacts"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;邮箱：<input type="text" class="input3" value="${retCompanyEnt.mail}" name="CompanyEnt.mail"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;邮编：<input type="text" class="input3" value="${retCompanyEnt.zipCode}" name="CompanyEnt.zipCode"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;公司简介：<input type="text" class="input3" value="${retCompanyEnt.companySynopsis}" name="CompanyEnt.companySynopsis"/>
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