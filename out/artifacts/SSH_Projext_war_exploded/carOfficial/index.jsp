<%--
  Created by IntelliJ IDEA.
  User: Fiend
  Date: 2019/12/11
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <!--<script src="js/jQuery1.7.2.js" type="text/javascript"></script>-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/carOfficial/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/metinfo_ui.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/carOfficial/js/ch.js" type="text/javascript"></script>
    <!--[if IE]>
    <script src="public/js/html5.js" type="text/javascript"></script>
    <![endif]-->
</head>

<body>


<header>
    <div class="inner top">

        <a href="" title="奇点汽修公司" id="web_logo">
            <img src="${pageContext.request.contextPath}/carOfficial/img/1363847903.png"
                 style="width: 210px; height: 55px;" style="width: 210px; height: 55px;"
                 alt="奇点汽修公司" title="奇点汽修公司" style="margin:0px 0px 0px 10px;"/>
        </a>

        <div class="top-seo">
            <div class="tpseotxt">
                <p>
                    &nbsp;020-5856-1762</p>
            </div>
        </div>
    </div>
</header>
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


<div class="inner met_flash">
    <div class="flash">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/carOfficial/css/nivo-slider.css" type="text/css"
              media="screen"/>
        <script type="text/javascript"
                src="${pageContext.request.contextPath}/carOfficial/js/jquery.nivo.slider.pack.js"></script>
        <style type="text/css">
            .metinfo-banner1 img {
                height: 300px !important;
            }
        </style>
        <div class="slider-wrapper metinfo-banner1" style="height:300px;">
            <div id="slider" class="nivoSlider">
                <c:forEach items="${seCarList}" var="item">
                    <img src='${pageContext.request.contextPath}/upFile/${item.vehicleImg}' alt='' width='1100'
                         height='350'/>
                </c:forEach>
            </div>
        </div>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#slider').nivoSlider({
                    effect: 'random',
                    pauseTime: 2000,
                    directionNav: false
                });
            });
        </script>
    </div>
</div>

<div class="inner main">

    <div class="about-x fl b-r dg01">
        <h3>
            [关于我们]
            <span>[About Us]</span>
        </h3>
        <div class="editor">
            <div>
                ${company.companySynopsis}
            </div>

            <div class="clear"></div>
        </div>
    </div>
    <div class="newlist-x fl b-r dg01">
        <h3 class="ti"><span>汽车保养</span><a href="news.html" title="链接关键词" class="more">More</a></h3>
        <ol class='list-none metlist'>
            <li class='list top'><span class='time'>2013-03-19</span><a href='news.html' title='春天风沙灰尘较大 车主应如何养车'
                                                                        target='_self'>春天风沙灰尘较大 车主应如何养车</a></li>
            <li class='list '><span class='time'>2013-03-19</span><a href='news.html' title='遭遇汽车服务七大陷阱 车主防不胜防'
                                                                     target='_self'>遭遇汽车服务七大陷阱 车主防不胜防</a></li>
            <li class='list '><span class='time'>2013-03-19</span><a href='news.html' title='爱车不要太过分 错误维护影响车辆正常使用'
                                                                     target='_self'>爱车不要太过分 错误维护影响车辆正常使用</a></li>
            <li class='list '><span class='time'>2013-03-19</span><a href='news.html' title='专家点评：爱车可能存在的养车误区'
                                                                     target='_self'>专家点评：爱车可能存在的养车误区</a></li>
            <li class='list '><span class='time'>2013-03-19</span><a href='news.html' title='汽车保养黑幕详解 做保养时最好全程看护'
                                                                     target='_self'>汽车保养黑幕详解 做保养时最好全程看护</a></li>
        </ol>
    </div>
    <div class="case-x fr b-r dg01 tupAple">
        <h3 class="ti"><span>服务类型</span><a href="cases/" title="链接关键词" class="more">More</a></h3>
        <ol class='list-none metlist'>
            <li class='list'>
                <a href='car_serviceType.html' title='宝马' target='_self' class='img'><img
                        src='${pageContext.request.contextPath}/upFile/${seCarList[0].vehicleImg}'
                        alt='${seCarList[0].vehicleName}'
                        title='${seCarList[0].vehicleName}' width='210'
                        height='130'/></a>
            </li>
        </ol>
    </div>
    <div class="clear"></div>

    <div class="productlist-x tupAple">
        <h3 class="b-r pti">
            <a href="" title="链接关键词" class="more">More</a>
            <span>奇点汽修产品</span>
        </h3>
        <ol class="list-none metlist">

            <c:forEach items="${stockList}" var="item" varStatus="index">
                <li class="list" style='width:182px; margin-left:7px; margin-right:7px;'>
                    <div>
                        <a href="product_Detail.html" title="${item.fittingName}" target='_self' class="img">
                            <img src="${pageContext.request.contextPath}/upFile/${item.img}" alt="${item.fittingName}"
                                 title="${item.fittingName}" width="160" height="130"/>
                        </a>
                        <h3><a href="product_Detail.html" title="${item.fittingName}"
                               target='_self'>${item.fittingName}</a></h3>
                        <p class='descr'>${item.functions}</p><a href='product13.html'
                                                                 title='${item.fittingName}'
                                                                 target='_self'
                                                                 class='more'>查看产品详细</a>
                    </div>
                </li>
            </c:forEach>


        </ol>
        <div class="clear"></div>
    </div>

    <div class="friendlk b-r">
        <h3>
            <a href="link/" title="链接关键词" class="more">More</a>
            <span>友情链接</span>
        </h3>
        <div class="lktxt">
            <ul class='list-none'>

            </ul>

            <div class="clear"></div>
        </div>
        <div class="lkimg">
            <ul class='list-none'>
            </ul>

            <div class="clear"></div>
        </div>
    </div>

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


</body>

</html>