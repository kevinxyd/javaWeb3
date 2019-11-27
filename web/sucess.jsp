<%--
  Created by IntelliJ IDEA.
  User: FTKJ
  Date: 2019/11/19
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();    //上下文路径
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>

    <meta name="viewport" content="width=device-width, initialscale=1">
    <!-- 1. 导入bootstrap的css样式 -->
    <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. 导入jquery框架 -->
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/jquery.validate.min.js"></script>
    <!-- 3. 导入bootstrap框架文件 -->
    <script src="static/bootstrap/js/bootstrap.min.js"></script>
    <title>Title</title>
</head>
<body>
<div class="container">

    <h1 class="text-center">查询</h1>
    <div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
        <a href="add.jsp" class="btn btn-primary text-left col-md-1">添加</a>
        <a href="index.jsp" class="btn btn-danger text-right col-md-offset-10">退出</a>
    </div>
    <br><br>
    <table class="table table-striped text-center table-hover">
        <tr>
            <td>序号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>注册时间</td>
            <td colspan="2">操作</td>
        </tr>

        <c:forEach var="k" items="${list}" varStatus="str">
            <tr>
                <td>${str.index+1}</td>
                <td>${k.name}</td>
                <td>${k.age}</td>
                <td>${k.sex}</td>
                <td>
                    <fmt:parseDate var="birthDate" value="${k.createTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:parseDate>
                    <fmt:formatDate value="${birthDate}" pattern="yyyy年MM月dd日"></fmt:formatDate>
                </td>
                <td><a href="/updateList?id=${k.id}" class="btn btn-success" >修改</a></td>
                <td><a href="/delete?id=${k.id}" class="btn btn-primary">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
