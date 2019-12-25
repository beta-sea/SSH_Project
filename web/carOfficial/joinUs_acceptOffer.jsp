<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/12/24
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit">
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>奇点汽修有限公司</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/carOfficial/css/meteinfo_ui.css"
          id="metuimodule" data-module="1"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/carOfficial/css/metinfo.css"/>
    <script src="${pageContext.request.contextPath}/carOfficial/js/jQuery1.7.2.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/metinfo_ui.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath}/carOfficial/js/ch.js" type="text/javascript"></script>
    <style type="text/css">
        html,
        body {
            margin: 0;
            padding: 0;
        }

        .iw_poi_title {
            color: #CC5522;
            font-size: 14px;
            font-weight: bold;
            overflow: hidden;
            padding-right: 13px;
            white-space: nowrap
        }

        .iw_poi_content {
            font: 12px arial, sans-serif;
            overflow: visible;
            padding-top: 4px;
            white-space: -moz-pre-wrap;
            word-wrap: break-word
        }
    </style>
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

        <a href="../" title="汽配公司" id="web_logo">
            <img src="${pageContext.request.contextPath}/carOfficial/img/1363847903.png"
                 style="width: 210px; height: 55px;" alt="汽配公司" title="汽配公司"
                 style="margin:0px 0px 0px 10px;"/>
        </a>

        <div class="top-seo">
            <div class="tpseotxt">
                <p>
                    &nbsp;020-5856-1762</p>
            </div>
        </div>
    </div>
</header>

<div class="inner met_flash">
    <div class="flash">
        <img src='${pageContext.request.contextPath}/carOfficial/img/1363850250.jpg' width='980' alt='' height='300'>
    </div>
</div>

<div class="sidebar inner">


    <div class="sb_nav">

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
            <div class="position">当前位置：<a href="../" title="网站首页">网站首页</a> &gt; <a href=../Logistics/ >在线招聘</a></div>
            <span>在线招聘</span>
        </h3>
        <div class="clear"></div>

        <form id="frmAddCandidateInfo" method='POST' onSubmit='return Checkcv();' name='myform'
              action='${pageContext.request.contextPath}/joinUs_addRecruitEnt.action'
              target='_self'>
            <input type='hidden' name='lang' value='cn'/>
            <table class='cv_table'>
                <tr>
                    <td class='text'>应聘职位</td>
                    <td class='input'>
                        <input name="recruitEnt.job" value="${job}" disabled>
                    </td>
                </tr>
                <tr>
                    <td class='text'>姓名</td>
                    <td class='input'><input name='recruitEnt.name' type='text' class='input-text' size='40'><span
                            class='info' id="name">*</span></td>
                </tr>
                <tr>
                    <td class='text'>性别:</td>
                    <td class='input'>
                        <input name='recruitEnt.sex' type='radio' id='para18' value='男' checked='checked'/>
                        <label for='para18'>男</label>
                        <input name='recruitEnt.sex' type='radio' id='para28' value='女'/>
                        <label for='para28'>女</label>
                        <span class='info' id="sex">*</span><span></span></td>
                </tr>
                <tr>
                <tr>
                    <td class='text'>身份证号码</td>
                    <td class='input'>
                        <input name='recruitEnt.idCard' type='text' class='input-text' size='40'><span
                            id="idCardNo"
                            class='info'>*</span>
                    </td>
                </tr>

                <tr>
                    <td class='text'></td>
                    <td class='submint'>
                        <input id="btnSubmit" type='submit' name='Submit' value='提交信息'
                               class='submit button orange'/></td>
                </tr>
            </table>
        </form>

    </div>
    <div class="clear"></div>
</div>

<footer class="inner">
    <div class="foot-nav">
        <a href="${pageContext.request.contextPath}/abou_showInfoToAbou.action" 0 title='关于我们'>关于我们</a><span>|</span>
        <a href='${pageContext.request.contextPath}/contact_showInfoToFeedBackDetail.action' title='客户留言'>客户留言</a><span>|</span>
        <a href='${pageContext.request.contextPath}/booking_showInfoToBooking.action' title='在线预约'>在线预约</a><span>|</span>
        <a href='${pageContext.request.contextPath}/joinUs_showInfoToJoinUs.action?map.pageNo=1&map.pageSize=10' title='人才招聘'>人才招聘</a><span>|</span>
        <a href='${pageContext.request.contextPath}/contact_showInfoToContact.action' title='网站地图'>联系我们</a>
    </div>
    <div class="foot-text">
        <p>奇点汽修有限公司版权所有 2017-2018 备案号：渝ICP备13004606
        </p>
        <p>电话：020-5856-1762</p>
    </div>
</footer>

<script type="text/javascript">
    // $(function () {
    //     $("#btnSubmit").onclick(function () {
    //         var name = $("input[name=candidateName]").val();
    //         var phone = $("input[name=telephone]").val();
    //         var number = $("input[name=number]").val();
    //
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
    //         //判断身份证号码有效性
    //         //获取身份证号
    //
    //         var flagIDCard = isCardNo(number);
    //         if (flagIDCard == false) {
    //             $("#idCardNo").text("身份证输入不合法！");
    //             return false;
    //         }
    //         $("#idCardNo").text("");
    //
    //         //可以提交
    //         $("#frmAddCandidateInfo").submit();
    //
    //     });
    //
    // });
    //
    //
    // //正则表达式判断身份证是否合法
    // function isCardNo(card) {
    //
    //     // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X
    //     var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    //     if (reg.test(card) === false) {
    //         return false;
    //     }
    //
    // }
    
    $(function () {
        $("#btnSubmit").click(function () {

            layer.msg('留言成功');
        });

    });
    
    
</script>


</body>

</html>