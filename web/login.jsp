<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/4
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<%--把form表单的get方式换成post方式提交,数据比较安全,并且不会在地址栏显示--%>
<form method="post">
    姓名
    <input type="text" name="username">
    <br/>
    密码
    <input type="password" name="password">
    <input type="submit" value="提交">
</form>
</form>
</body>
</html>
