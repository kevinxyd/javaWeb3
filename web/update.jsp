<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: FTKJ
  Date: 2019/11/19
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. 导入jquery框架 -->
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/jquery.validate.min.js"></script>
    <!-- 3. 导入bootstrap框架文件 -->
    <script src="static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1 class="text-center">修改</h1>
    <form action="/update" method="post">
        <input type="hidden" name="id" value="${user.id}">
        <div class="form-group">
            <label for="exampleInputEmail1">姓名：</label>
            <input type="text" class="form-control" id="exampleInputEmail1" placeholder="请输入姓名" name="name"  <c:if test="${user.name eq '武大郎'}">readonly</c:if> value="${user.name}">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">年龄：</label>
            <input type="text"  name="age" class="form-control" id="exampleInputPassword1" placeholder="请输入年龄" <c:if test="${user.name eq '武大郎'}">readonly</c:if> value="${user.age}">
        </div>
        <div class="form-group">
            <label>性别：</label>
            <input type="radio" name="sex" value="男" <c:if test="${user.sex eq '男'}">checked</c:if>>男
            <input type="radio" name="sex" value="女" <c:if test="${user.sex eq '女'}">checked</c:if>>女
        </div>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
</body>
</html>
