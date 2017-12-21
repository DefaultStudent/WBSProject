<%--
  Created by IntelliJ WebStorm.
  User: JOSHSHUI
  Date: 2017/12/18
  Time: 下午5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css\common.css">
    <link rel="stylesheet" type="text/css" href="css\login.css">
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
</head>

<body>
    <div class="login">
        <div class="login_nav">
            <div class="nav_slider">
                <a href="#" class="signup focus">注册</a>
                <a href="#" class="signin">登录</a>
            </div>
        </div>
            <form name="form2" action="register" method="post">
                <div class="input_signup active">
                    <input class="input" id="cus_id" name="cusId" type="text" aria-label="用户帐号" placeholder="你的邮箱"/><br/>
                    <div class="hint">请填写符合格式的邮箱</div>
                    <input class="input" id="cus_alias" name="cusAlias" type="text" aria-label="用户昵称（包含字母/数字/下划线）" placeholder="用户昵称"/><br/>
                    <div class="hint">请填写符合格式的用户昵称</div>
                    <input class="input" id="cus_name" name="cusName" type="text" aria-label="真实姓名" placeholder="真实姓名"/><br/>
                    <div class="hint">请填写真实姓名</div>
                    <div id="cus_gender">
                        性别:<input class="input" id="cus_gender1" type="radio" name="cusGender" value="男" checked="checked">男&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input class="input" id="cus_gender2" type="radio" name="cusGender" value="女" checked="checked">女<br/>
                        <div class="hint">请选择性别</div>
                    </div>
                    <input class="input" id="cus_pwd" name="cusPwd" type="text"aria-label="密码" placeholder="密码"/><br/>
                    <div class="hint">请填写符合格式的密码</div>
                    <input class="input" id="cus_pwd1" type="text" aria-label="重复密码" placeholder="重复密码"/><br/>
                    <div class="hint">请再次输入密码</div>
                    <input class="input" id="cus_tel" name="cusTel" type="text" aria-label="手机号" placeholder="手机号"/><br/>
                    <div class="hint">请填写手机号</div>
                    <input class="input" id="cus_birth" name="cusBirth" type="text" aria-label="生日" placeholder="生日"/><br/>
                    <div class="hint">请选择生日</div>
                    <input id="submit" type="submit" class="button" name="button" value="注册"/><br/>
                </div>
            </form>
            <form method="post" action="login" name="form1">
                <div class="input_signin">
                    <input class="input" id="login_id" name="cusId" type="text" aria-label="用户帐号" placeholder="你的注册邮箱"/><br/>
                    <div class="hint">请填写你的注册帐号</div>
                    <input class="input" id="login_pwd" name="cusPwd" type="password" placeholder="密码"/><br/>
                    <div class="hint">请填写你的密码</div>
                    <input type="submit" id="button" class="button" value="登录">
                    <div class="forget">
                        <a href="#">忘记密码？</a>
                    </div>
                </div>
            </form>
    </div>
    <script type="text/javascript" src="js\login.js"></script>
</body>
</html>
