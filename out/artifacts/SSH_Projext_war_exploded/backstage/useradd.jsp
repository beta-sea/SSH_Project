<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/11/20
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>添加用户-有点</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/backstage/css/css.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/backstage/js/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="${pageContext.request.contextPath}/backstage/img/coin02.png"/><span><a href="#">首页</a>&nbsp;-&nbsp;<a
                href="#">公共管理</a>&nbsp;-</span>&nbsp;意见管理
        </div>
    </div>
    <div class="page ">
        <form action="${pageContext.request.contextPath}/staff_addStaffEnt.action" method="post">
            <div class="banneradd bor">
                <div class="baTopNo">
                    <span>员工添加</span>
                </div>
                <div class="baBody">
                    <div class="bbD">
                    <input type="hidden" name="staffEnt.staffId"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名：<input type="text" class="input3" name="staffEnt.name"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：
                    <label><input type="radio" name="staffEnt.sex" value="男"/>&nbsp;男</label>
                    <label><input type="radio" name="staffEnt.sex" value="女"/>&nbsp;女</label>
                </div>
                    <div class="bbD">
                        <input type="hidden" name="staffEnt.staffId"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门id：<input type="text" class="input3" name="staffEnt.storageId"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;职位：
                        <input type="text" class="input3" name="staffEnt.job"/>
                    </div>
                    <div class="bbD">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;身份证号码：<input type="text" class="input3"
                                                                      name="staffEnt.idCard"/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机：<input type="text" class="input3" name="staffEnt.tel"/>
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
        <!-- 会员注册页面样式end -->
    </div>
</div>
</body>
</html>
