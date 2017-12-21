<%@ page language="java" contentType="text/html; UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>图书商城</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
    <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link type="text/css" href="css/theme.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>
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

            <!--图书信息模块-->
            <div class="span9">
                <div class="content">

                    <div class="module">
                        <div class="module-head">
                            <h3>图书信息</h3>
                        </div>
                        <div class="module-body">
                            <p>
                                <strong>图书信息纵览</strong>
                                -
                                <small></small>
                            </p>
                            <table class="table table-striped">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>图书名称</th>
                                    <th>图书类型</th>
                                    <th>图书价格</th>
                                    <th>出版社</th>
                                    <th>添加</th>
                                </tr>
                                </thead>
                                <s:iterator var="bookinfo" value="#session.bookinfo">
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td><s:property value="#bookinfo.bookname"/></td>
                                            <td><s:property value="#bookinfo.booktypename"/></td>
                                            <td><s:property value="#bookinfo.bookprice"/></td>
                                            <td><s:property value="#bookinfo.pubname"/></td>
                                            <td><a href="#">添加至购物车</a> </td>
                                        </tr>
                                    </tbody>
                                </s:iterator>
                            </table>
                            <br />
                            <!-- <hr /> -->
                        </div><!--/.content-->
                    </div><!--/.span9-->
                    <!--图书信息模块-->
                </div>
            </div><!--/.container-->
        </div><!--/.wrapper-->

        <div class="footer">
            <div class="container">


                <b class="copyright">&copy; 2014 Edmin - EGrappler.com </b> All rights reserved.
            </div>
        </div>

        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="js/jquery-ui-1.10.1.custom.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/datatables/jquery.dataTables.js"></script>
        <script>
            $(document).ready(function() {
                $('.datatable-1').dataTable();
                $('.dataTables_paginate').addClass("btn-group datatable-pagination");
                $('.dataTables_paginate > a').wrapInner('<span />');
                $('.dataTables_paginate > a:first-child').append('<i class="icon-chevron-left shaded"></i>');
                $('.dataTables_paginate > a:last-child').append('<i class="icon-chevron-right shaded"></i>');
            } );
        </script>
</body>
