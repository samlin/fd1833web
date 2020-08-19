<%@ page import="com.fd.controller.UserController" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/3
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> this is index </h1>
<a href="${pageContext.request.contextPath}/forward" >演示转发</a>
<a href="${pageContext.request.contextPath}/redirect" >演示重定向</a>
<
<a href="${pageContext.request.contextPath}/writer?name=zhangsan&age=40&name=lisi&name=wangwu" >演示getWriter</a>
<a href="${pageContext.request.contextPath}/session" >演示Session</a>
<br/>
<% UserController userController=new UserController();
    out.println(userController.getUserName());
%>
</body>
</html>
