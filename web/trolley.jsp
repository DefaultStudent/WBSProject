<%@ page import="com.wbs.bookinfo.vo.BookInfo" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.math.BigDecimal" %><%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/21
  Time: 下午7:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>图书商城</title>
    <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css">
    <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link type="text/css" href="css/theme.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/carts.css">
</head>
<body>
<!--顶部导航栏-->
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                <i class="icon-reorder shaded"></i>
            </a>

            <a class="brand" href="table_after.html">
                图书商城
            </a>

            <div class="nav-collapse collapse navbar-inverse-collapse">
                <form class="navbar-search pull-left input-append" action="#">
                    <input type="text" class="span3" placeholder="搜索想要的图书">
                    <button class="btn" type="button">
                        <i class="icon-search"></i>
                    </button>
                </form>

                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Item No. 1</a></li>

                            <li><a href="#">Don't Click</a></li>
                            <li class="divider"></li>
                            <li class="nav-header">Example Header</li>
                            <li><a href="#">A Separated link</a></li>
                        </ul>
                    </li>

                    <li><a href="#">
                        Support
                    </a></li>
                    <li class="nav-user dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="images/user.png" class="nav-avatar" />
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">个人信息</a></li>
                            <li><a href="#">修改个人信息</a></li>
                            <li><a href="#">设置</a></li>
                            <li class="divider"></li>
                            <li><a href="">注销</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.nav-collapse -->
        </div>
    </div><!-- /navbar-inner -->
</div><!-- /navbar -->
<!--顶部导航栏-->
<!--侧边导航栏-->
<div class="wrapper">
    <div class="container">
        <div class="row">
            <div class="span3">
                <div class="sidebar">

                    <ul class="widget widget-menu unstyled">
                        <li class="active">
                            <a href="table_after.html">
                                <i class="menu-icon icon-dashboard"></i>
                                图书信息
                            </a>
                        </li>
                        <li>
                            <a href="activity.html">
                                <i class="menu-icon icon-bullhorn"></i>
                                News Feed
                            </a>
                        </li>
                        <li>
                            <a href="trolley.html">
                                <i class="menu-icon icon-inbox"></i>
                                购物车
                            </a>
                        </li>

                        <li>
                            <a href="task.html">
                                <i class="menu-icon icon-tasks"></i>
                                订单管理
                            </a>
                        </li>
                    </ul><!--/.widget-nav-->

                    <ul class="widget widget-menu unstyled">
                        <li>
                            <a class="collapsed" data-toggle="collapse" href="#togglePages">
                                <i class="menu-icon icon-cog"></i>
                                <i class="icon-chevron-down pull-right"></i><i class="icon-chevron-up pull-right"></i>
                                图书类别
                            </a>
                            <ul id="togglePages" class="collapse unstyled">
                                <li>
                                    <a href="">
                                        <i class="icon-inbox"></i>
                                        科技类
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <i class="icon-inbox"></i>
                                        技术书籍
                                    </a>
                                </li>
                                <li>
                                    <a href="">
                                        <i class="icon-inbox"></i>
                                        小说
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#">
                                <i class="menu-icon icon-signout"></i>
                                注销
                            </a>
                        </li>
                    </ul>
                </div><!--/.sidebar-->
            </div><!--/.span3-->
            <!--侧边导航栏-->
            <!--/.购物车选择 -->
            <div class="span9">
                <div class="module">
                    <div class="module-head">
                        <h3>购物车</h3>
                    </div>
                    <div class="cartMain_hd">
                        <ul class="order_lists cartTop">
                            <li class="list_chk">
                                <!--所有商品全选-->
                                <input type="checkbox" id="all" class="whole_check">
                                <label for="all"></label>
                                全选
                            </li>
                            <li class="list_con">商品信息</li>
                            <li class="list_info">商品参数</li>
                            <li class="list_price">单价</li>
                            <li class="list_amount">数量</li>
                            <li class="list_sum">金额</li>
                            <li class="list_op">操作</li>
                        </ul>
                    </div>
                    <hr/>
                    <div class="order_content">
                        <ul class="order_lists">
                            <%
                                double total = 0;
                                if(session.getAttribute("shop")!=null){
                                    List<BookInfo> list=(List<BookInfo>)session.getAttribute("shop");
                                    Iterator<BookInfo> it=list.iterator();
                                    int i =1;
                                    while(it.hasNext()){
                                        BookInfo bookInfo= it.next();
                                        total += bookInfo.getBookprice();

                            %>
                            <li class="list_chk">
                                <input type="checkbox" id="checkbox_2" class="son_check">
                                <label for="checkbox_2"></label>
                            </li>
                            <li class="list_con"><!--图和名称-->
                                <div class="list_text"><%=bookInfo.getBookname() %></div>
                            </li>
                            <li class="list_info"><!--具体信息-->
                                <p><%=bookInfo.getIsbn()%></p>
                                <p><%=bookInfo.getAuthor()%></p>
                            </li>
                            <li class="list_price"><!--单价-->
                                <p class="price"><%=bookInfo.getBookprice()%></p>
                            </li>
                            <li class="list_amount">
                                <div class="amount_box">
                                    <a href="javascript:;" class="reduce reSty">-</a>
                                    <input type="text" value="1" class="sum">
                                    <a href="javascript:;" class="plus">+</a>
                                </div>
                            </li>

                            <li class="list_sum"><!--总金额-->
                                <p class="sum_price"><%=total%></p>
                            </li>
                            <%
                                        i++;}

                                }


                            %>
                            <li class="list_op"><!--移除商品-->
                                <p class="del"><a href="javascript:;" class="delBtn">移除商品</a></p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--/.购物车选择 -->
        <!--底部-->
        <div class="bar-wrapper">
            <div class="bar-right">
                <div class="piece">已选商品<strong class="piece_num">0</strong>件</div>
                <div class="totalMoney">共计: <strong class="total_text">0.00</strong></div>
                <div class="calBtn"><a href="javascript:;">结算</a></div>
            </div>
        </div>
        <section class="model_bg"></section>
        <section class="my_model">
            <p class="title">删除宝贝<span class="closeModel">X</span></p>
            <p>您确认要删除该宝贝吗？</p>
            <s:iterator var="shop" value="#session.shop">
            <div class="opBtn"><s:a href="javascript:;delCar?isbn=%{#shop.isbn}" class="dialog-sure">确定</s:a><a href="javascript:;" class="dialog-close">关闭</a></div>
            </s:iterator>
        </section>
    </div>
        <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
        <script src="js/carts.js"></script><!--购物车js -->


        <script src="scripts/jquery-1.9.1.min.js"></script>
        <script src="scripts/jquery-ui-1.10.1.custom.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="scripts/datatables/jquery.dataTables.js"></script>
        <script>
            $(document).ready(function() {
                $('.datatable-1').dataTable();
                $('.dataTables_paginate').addClass("btn-group datatable-pagination");
                $('.dataTables_paginate > a').wrapInner('<span />');
                $('.dataTables_paginate > a:first-child').append('<i class="icon-chevron-left shaded"></i>');
                $('.dataTables_paginate > a:last-child').append('<i class="icon-chevron-right shaded"></i>');
            } );
        </script>
</div>
</body>
</html>
