<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/30
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>userinfo</h1>
<table>
    <tr>
        <td>username</td><td><%=request.getAttribute("username")%></td></tr>
    <tr><td>password</td><td><%=request.getAttribute("password")%></td></tr>
    <tr>   <td>email</td><td><%=request.getAttribute("email")%></td></tr>
    <tr>  <td>gender</td><td><%=request.getAttribute("gender")%></td></tr>
    <tr>  <td>birthdate</td><td><%=request.getAttribute("birthdate")%></td>
    </tr>
</table>
</body>
</html>
<%@include file="footer.jsp"%>