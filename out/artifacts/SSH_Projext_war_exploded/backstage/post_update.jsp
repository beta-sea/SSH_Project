<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Extragalactic
  Date: 2019/12/5
  Time: 16:33
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
                href="#">招聘管理</a>&nbsp;-</span>&nbsp;招聘信息修改
        </div>
    </div>
    <div class="bgm" >
        <div class="page" style="background-image:url(${pageContext.request.contextPath}/backstage/img/1.png); background-position: 400px; background-repeat: no-repeat">
            <form action="${pageContext.request.contextPath}/post_upDateSavePerEnt.action" method="post">
                <!-- 上传广告页面样式 -->
                <div class="banneradd bor">
                    <div class="baTopNo">
                        <span>修改招聘</span>
                    </div>
                    <div class="baBody">

                        <div class="bbD" >
                            <input type="hidden" name="postEnt.id" value="${retPerEnt.id}" />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;职位名称：<input type="text" class="input3" value="${retPerEnt.jobName}" name="postEnt.jobName" />
                            </br></br>
                            &nbsp;&nbsp;&nbsp;&nbsp;<label>职位要求：</label>
                            <div class="btext2" >
                                &nbsp;<textarea class="text2" name="postEnt.jobClaim"  >${retPerEnt.jobClaim}</textarea>
                            </div>
                            </br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;岗位职责：
                            <div class="btext2">
                                &nbsp;<textarea class="text2" name="postEnt.duties" >${retPerEnt.duties}</textarea>
                            </div>
                        </div>

                        <div class="bbD">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招聘数量：<input type="text" class="input3" name="postEnt.number" value="${retPerEnt.number}" />
                            </br></br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门编号：<input type="text" class="input3" name="postEnt.storageId" value="${retPerEnt.storageId}" />
                        </div>

                        <div class="bbD">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;开始时间：<input type="text" class="input3" name="postEnt.startTime" value="${retPerEnt.startTime}" />
                            </br></br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;截止时间：<input type="text" class="input3" name="postEnt.deadline" value="${retPerEnt.deadline}" />
                        </div>

                        <div class="bbD">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工作地点：
                            <div class="btext2">
                                &nbsp;<textarea class="text2" name="postEnt.workAddress"  >${retPerEnt.workAddress}</textarea>
                            </div>
                        </div>


                    </div>
                    <div class="bbD">
                        <p class="bbDP">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input class="btn_yes btn_ok" type="submit" value="提交">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

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