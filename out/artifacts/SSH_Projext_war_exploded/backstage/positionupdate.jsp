<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/29
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                href="#">公共管理</a>&nbsp;-</span>&nbsp;行家编辑
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/person_upDateSavePerEnt.action" method="post">
            <!-- 上传广告页面样式 -->
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>行家编辑</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                        <input type="hidden"value="${retPerEnt.id}" name="perEnt.id"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名：<input type="text" class="input3" value="${retPerEnt.name}" name="perEnt.name"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别
                        <label><input type="radio" name="perEnt.sex"
                                      <c:if test="${retPerEnt.sex eq '男'}">checked</c:if> value="男"/>&nbsp;男</label>
                        <label><input type="radio" name="perEnt.sex"
                                      <c:if test="${retPerEnt.sex eq '女'}">checked</c:if> value="女"/>&nbsp;女</label>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;年龄：<input type="text" class="input3" value="${retPerEnt.age}" name="perEnt.age"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机：<input type="text" class="input3" value="${retPerEnt.tel}" name="perEnt.tel"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址：<input type="text" class="input3" value="${retPerEnt.address}" name="perEnt.address"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门：
                        <select class="input3" name="perEnt.department">
                            <option>===请选择===</option>
                            <option value="${retPerEnt.department}"
                                    <c:if test="${retPerEnt.department eq '售后部'}">selected</c:if>>售后部
                            </option>
                            <option value="${retPerEnt.department}"
                                    <c:if test="${retPerEnt.department eq '销售部'}">selected</c:if>>销售部
                            </option>
                        </select>
                    </div>

                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;备注：
                        <div class="btext2">
                            <textarea class="text2" value="${retPerEnt.mark}" name="perEnt.mark"></textarea>
                        </div>
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