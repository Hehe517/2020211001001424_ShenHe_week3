<%@ page import="com.ShenHe.model.User" %><%--
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
<%
User U= (User) session.getAttribute("user");
%>
<table>
    <tr>
        <td>username</td><td><%=U.getUsername()%></td></tr>
    <tr><td>password</td><td><%=U.getPassword()%></td></tr>
    <tr>   <td>email</td><td><%=U.getEmail()%></td></tr>
    <tr>  <td>gender</td><td><%=U.getGender()%></td></tr>
    <tr>  <td>birthdate</td><td><%=U.getBirthdate()%></td>
    </tr>
</table>
</body>
</html>
<%@include file="footer.jsp"%>