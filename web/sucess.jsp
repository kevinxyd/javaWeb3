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
        <form action="/list" method="post" class="text-center">
            姓名：<input type="text" name = "name" value="${name}">
            <input type="submit" value="查询" class="btn-primary" placeholder="输入姓名关键字查询">
        </form>
        <a href="add.jsp" class="btn btn-primary text-left col-md-1">添加</a>
        <a href="<%=basePath%>exit" class="btn btn-danger text-right col-md-offset-10">退出</a>
    </div>
    <br><br> <br><br>
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
    <br>
    <div class="text-center">
        <h4>当前页：${page.currPage}，总页数：${page.totalPage},总记录数：${page.totalNumber},每页显示记录数：${page.rows}</h4>
        <c:if test="${page.currPage!=1 }">
            <a href="/list?page=1&name=${name}" class="btn btn-success">首页</a>
            <a href="/list?page=${(page.currPage-1)}&name=${name}" class="btn btn-success">上一页</a>
        </c:if>
        <c:if test="${page.currPage!=page.totalPage}">
        <a href="/list?page=${(page.currPage+1)}&name=${name}" class="btn btn-success">下一页</a>
        <a href="/list?page=${page.totalPage}" class="btn btn-success">尾页</a>
        </c:if>
    </div>

</div>
</body>
</html>
