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
    <%
        //        新建一个Cookie
        Cookie cookie = new Cookie("address", "shenzhen");

//
//       设置session有效期 大于0是有效,单位是秒
        cookie.setMaxAge(30);

        //服务器端新建的Cookie,通过resp的addCookie返回到客户端(浏览器)
        response.addCookie(cookie);

    %>
</head>
<body>
<a href="${pageContext.request.contextPath}/cookie">查看所有Cookie</a>
</body>
</html>
