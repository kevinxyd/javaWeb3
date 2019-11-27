<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <!--当前网页使用最新的浏览器内核来解析，如：Edge-->
  <!-    viewport视口的参数设置:
  网页宽度：设备宽度
  初始的缩放比：1:1    -->
  <meta name="viewport" content="width=device-width, initialscale=1">
  <!-- 1. 导入bootstrap的css样式 -->
  <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- 2. 导入jquery框架 -->
  <script src="static/js/jquery-3.3.1.min.js"></script>
  <script src="static/js/jquery.validate.min.js"></script>
  <!-- 3. 导入bootstrap框架文件 -->
  <script src="static/bootstrap/js/bootstrap.min.js"></script>
  <title>Sina Microblog index</title>
</head>
<style>
  body{
    width: 100%;
    height: 919px;
    background-repeat: no-repeat;
    background-size: cover;
    animation:mymove 5s infinite;
    overflow: hidden;
  }
  .jumbotron{
    margin: auto ;
    width: 20%;
    height: 38%;
    background-color:rgba(255,255,255,0.25)
  }
  .input-group-addon{
    width: 30%;
    height: 45px;
    padding: 0px;
    color: white;
    background-color:rgba(100,100,100,0.25);
  }
  .input-group{
    margin-top: 20px;
    margin-right: 20px;
    width: 101%;
  }
  .form-control{
    height: 45px;
  }
  .text-center{
    margin-top: 20px;
  }
  .btn{
    height: 40px;
    width: 120px;
  }
  .btn-primary{
    margin-right: 20px;
  }
</style>
<body>
<div class="container-fluid">
  <br><br><br><br><br><br><br><br>
  <h1 class="text-center">登录</h1>
  <div class="jumbotron">
    <form action="/login"  method="post">
      <div class="form-group">
        <div class="input-group">
          <div class="input-group-addon">账号</div>
          <input class="form-control admin" type="text" value="武大郎" name="username" placeholder="请输入账号">
        </div>
        <label  class="error"></label>
        <div class="input-group">
          <div class="input-group-addon">密码</div>
          <input class="form-control mima" type="password" value="56" name="age" placeholder="请输入密码">
        </div>
        <label  class="error"></label>
        <div class="text-center">
          <input type="submit" id="ss" class="btn btn-default" value="登录"/>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>
