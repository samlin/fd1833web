<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html content="text/html;charset=UTF-8">
<head>
    <META http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
<%--把form表单的get方式换成post方式提交,数据比较安全,并且不会在地址栏显示--%>
<form method="post" action="/login" >
    姓名
    <input type="text" name="username">
    <br/>
    密码
    <input type="password" name="password">
    <input type="submit" value="提交">
</form>
<% out.println("test"); %>
</form>
</body>
</html>
