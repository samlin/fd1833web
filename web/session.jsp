<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/6
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    Session ID:
    <%
        out.println(session.getId());
    %>
</head>
<body>
<a href="${pageContext.request.contextPath}/cookie">查看所有Cookie</a>
</body>
</html>
