<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Extragalactic
  Date: 2019/12/4
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>添加招聘信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;<a
                href="#">招聘管理</a>&nbsp;-</span>&nbsp;招聘信息管理
        </div>
    </div>
    <div class="bgm" >
        <div class="page" style="background-image:url(${pageContext.request.contextPath}/backstage/img/1.png); background-position: 400px; background-repeat: no-repeat">
            <form action="${pageContext.request.contextPath}/recruit_upDateSavePerEnt.action" method="post">
                <!-- 上传广告页面样式 -->
                <div class="banneradd bor">
                    <div class="baTopNo">
                        <span>修改简历信息</span>
                    </div>
                    <div class="baBody">

                        <div class="bbD" >
                            <input type="hidden" name="recruitEnt.id" value="${retPerEnt.id}" />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名：<input type="text" class="input3" value="${retPerEnt.name}" name="recruitEnt.name" />
                            </br></br>

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：<input type="text" class="input3" value="${retPerEnt.sex}" name="recruitEnt.sex" />
                            </br></br>

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;身份证：<input type="text" class="input3" value="${retPerEnt.idCard}" name="recruitEnt.idCard" />
                            </br></br>

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;职位：<input type="text" class="input3" value="${retPerEnt.job}" name="recruitEnt.job" />
                            </br></br>


                        </div>

                    </div>
                    <div class="bbD">
                        <p class="bbDP">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input class="btn_yes btn_ok" type="submit" value="提交">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a class="btn_ok btn_no" href="#">取消</a>
                        </p>
                    </div>

                </div>
            </form>
            <!-- 上传广告页面样式end -->
        </div>
    </div>
</div>
</body>
</html>