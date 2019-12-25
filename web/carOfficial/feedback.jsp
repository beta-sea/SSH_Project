<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/12/24
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入核心标签库jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta name="renderer" content="webkit">
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>奇点汽修有限公司</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/carOfficial/css/meteinfo_ui.css"
          id="metuimodule" data-module="1"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/carOfficial/css/metinfo.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/carOfficial/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/metinfo_ui.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/ch.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/layer.js" type="text/javascript"></script>

    <!--[if IE]>
    <script src="${pageContext.request.contextPath}/carOfficial/public/js/html5.js" type="text/javascript"></script>
    <![endif]-->
</head>

<body>
<div class="m-nav">
    <nav class="inner">
        <ul class="list-none">
            <li id="nav_10001" style='width:123px;' class='navdown'><a
                    href='${pageContext.request.contextPath}/index_showInfoToIndex.action' title='网站首页'
                    class='nav'><span>网站首页</span></a>
            </li>
            <li id='nav_1' style='width:123px;'><a href='${pageContext.request.contextPath}/abou_showInfoToAbou.action'
                                                   title='关于我们'
                                                   class='hover-none nav'><span>关于我们</span></a></li>
            <li id='nav_2' style='width:123px;'><a href='${pageContext.request.contextPath}/newsFont_showInfoToNews.action?map.pageNo=1&map.pageSize=10'
                                                   title='信息中心'
                                                   class='hover-none nav'><span>信息中心</span></a></li>
            <li id='nav_3' style='width:123px;'><a
                    href='${pageContext.request.contextPath}/product_showInfoToProduct.action?map.pageNo=1&map.pageSize=10'
                    title='奇点汽修产品' class='hover-none nav'><span>奇点汽修产品</span></a>
            </li>
            <li id='nav_4' style='width:122px;'><a
                    href='${pageContext.request.contextPath}/cases_showInfoToCases.action?map.pageNo=1&map.pageSize=10'
                    title='服务车型'
                    class='hover-none nav'><span>服务车型</span></a></li>
            <li id='nav_34' style='width:122px;'><a
                    href='${pageContext.request.contextPath}/joinUs_showInfoToJoinUs.action?map.pageNo=1&map.pageSize=10'
                    title='在线招聘'
                    class='hover-none nav'><span>在线招聘</span></a></li>
            <li id='nav_11' style='width:122px;'><a
                    href='${pageContext.request.contextPath}/booking_showInfoToBooking.action' title='在线预约'
                    class='hover-none nav'><span>在线预约</span></a></li>
            <li id='nav_18' style='width:122px;'><a
                    href='${pageContext.request.contextPath}/contact_showInfoToContact.action' title='联系我们'
                    class='hover-none nav'><span>联系我们</span></a></li>
        </ul>
    </nav>
</div>


<header>
    <div class="inner top">
        <a title="汽配公司" id="web_logo"> <img src="${pageContext.request.contextPath}/carOfficial/img/1363847903.png"
                                            style="width: 210px; height: 55px;" alt="汽配公司" title="汽配公司"
                                            style="margin:0px 0px 0px 10px;"/> </a>
        <div class="top-seo">
            <div class="tpseotxt">
                <p>
                    &nbsp;020-5856-1762</p>
            </div>
        </div>
    </div>
</header>
<div class="inner met_flash">
    <div class="flash"><img src='${pageContext.request.contextPath}/carOfficial/img/1363850250.jpg' width='980' alt=''
                            height='300'></div>
</div>
<div class="sidebar inner">
    <div class="sb_nav">
        <h3 class='title'>联系我们</h3>
        <div class="active b-r" id="sidebar" data-csnow="12" data-class3="0" data-jsok="2">
            <dl class="list-none navnow">
                <dt id='part2'><a href="${pageContext.request.contextPath}/contact_showInfoToContact.action"
                                  title='电话地址' class="zm"><span>联系我们</span></a></dt>
            </dl>
            <dl class="list-none navnow">
                <dt id='part2_' class='on'><a
                        href="${pageContext.request.contextPath}/contact_showInfoToFeedback.action" title='客户留言'
                        class="zm"><span>客户留言</span></a></dt>
            </dl>
            <dl class="list-none navnow">
                <dt id='part2_333'><a href="${pageContext.request.contextPath}/contact_showInfoToFeedBackDetail.action"
                                      title='留言内容' class="zm"><span>留言内容</span></a></dt>
            </dl>
            <div class="clear"></div>
        </div>
        <h3 class='title line'>联系方式</h3>
        <div class="active editor b-r">
            <div> 电话：${company.tel}</div>
            <div> 手机：${company.phone}</div>
            <div> QQ：${company.qq}</div>
            <div> 联系人：${company.contacts}</div>
            <div> 邮箱：${company.mail}</div>
            <div> 邮编：${company.zipCode}</div>
            <div class="clear"></div>
        </div>
    </div>
    <div class='sb_box b-r'>
        <h3 class="title">
            <div class="position">当前位置：<a href="../" title="网站首页">网站首页</a> &gt <a href=../message/ >客户留言</a></div>
            <span>客户留言</span></h3>
        <div class="clear"></div>
        <div class="active" id="messagelist">
            <h3 class="ctitle">提交留言</h3>
            <form method='POST' id="frmAddAdvice" target='_self'
                  action="${pageContext.request.contextPath}/contact_addLeavingEnt.action">
                <table class='feedback_table'>
                    <tr>
                        <td class='text'>姓名</td>
                        <td class='input'><input name='leavingEnt.messageUser' maxlength="10" type='text' size='30'
                                                 class='input-text'/><span class='info' id="name">*</span><span></span>
                        </td>
                    </tr>
                    <tr>
                        <td class='text'>电话</td>
                        <td class='input'><input maxlength="11" name='leavingEnt.tel' type='text' size='30'
                                                 class='input-text'/><span class='info' id="phone">*</span><span></span>
                        </td>
                    </tr>
                    <tr>
                        <td class='text'>留言内容</td>
                        <td class='input'><textarea maxlength="100" name='leavingEnt.message' class='textarea-text'
                                                    cols='50'
                                                    rows='5'></textarea><span class='info'
                                                                              id="content">*</span><span></span></td>
                    </tr>
                    <tr>
                        <td class='text'></td>
                        <td class='submint'><input type='hidden' name='fdtitle' value=''/>
                            <input id="btnSubmit" type='submit' value='提交信息' class='submit button orange'>
                            <br/>
                    </tr>
                </table>
            </form>

        </div>
    </div>
    <div class="clear"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/carOfficial/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    // $(function () {
    //     //alert()
    //     $("#btnSubmit").click(function () {
    //         var name = $("input[name=clientName]").val();
    //         var phone = $("input[name=telephone]").val();
    //         var content = $("textarea[name=content]").val();
    //         var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
    //         if (name == "") {
    //             $("#name").text("请输入姓名");
    //             return false;
    //         }
    //         $("#name").text("");
    //         if (!myreg.test(phone)) {
    //             $("#phone").text("请输入有效的手机号码！");
    //             return false;
    //         }
    //         $("#phone").text("");
    //
    //         if (content == "") {
    //             $("#content").text("请输入意见内容");
    //             return false;
    //         }
    //         $("#content").text("");
    //
    //         //可以提交
    //         //$("#frmAddAdvice").submit();
    //
    //     })
    //
    // });

    $(function () {
        $("#btnSubmit").click(function () {

            layer.msg('提交成功');
        });

    });


</script>


<footer class="inner">
    <div class="foot-nav">
        <a href="${pageContext.request.contextPath}/abou_showInfoToAbou.action" 0 title='关于我们'>关于我们</a><span>
					|</span><a href='${pageContext.request.contextPath}/contact_showInfoToFeedBackDetail.action' title='客户留言'>客户留言</a><span>|
						<span><a href='${pageContext.request.contextPath}/booking_showInfoToBooking.action' title='在线预约'>在线预约</a><span>|
						</span><a href='${pageContext.request.contextPath}/joinUs_showInfoToJoinUs.action?map.pageNo=1&map.pageSize=10' title='人才招聘'>人才招聘</a><span>|
				<a href='${pageContext.request.contextPath}/contact_showInfoToContact.action' title='网站地图'>联系我们</a>
    </div>
    <div class="foot-text">
        <p>奇点汽修有限公司版权所有 2017-2018 备案号：渝ICP备13004606
        </p>
        <p>电话：020-5856-1762</p>
    </div>
</footer>
</body>

</html>