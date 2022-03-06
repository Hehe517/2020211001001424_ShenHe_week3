<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/6
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include  file="header.jsp" %>
<%@include  file="footer.jsp" %>
<html>
  <head>
    <title>week5_homework</title>
  </head>
  <>
  <h1>welcome to my home page.</h1>
<br/>
  <h2>Welcome</h2>
  <form method="get" target='_blank' action="/search" >
      <input type="text" name="txt" size=30 >
      <select name="search">
          <option value="baidu">Baidu</option>
          <option value="bing">bing</option>
          <option value="google">Google</option>
      </select>
      <input type="submit" value="search"/>
  </form>
 <p>Hello,this is my homework</p>
  <br/>
  <a href="hello"> Student Info Servlet week2</a>
  <br/>
  <a href="register.jsp">Register-getParameter-week3</a>
  <br/>
  <a href="config">Config parameter-week4</a>
  <br/>
  <a href=register.jsp">Register JDBC -week4</a>
  <br/>
  <a href="index.jsp">include-week5</a>
  <br/>
  <a href="Login.jsp">Login-week5</a>
  </body>
</html>
