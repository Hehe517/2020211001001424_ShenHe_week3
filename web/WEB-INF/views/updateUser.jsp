<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.ShenHe.model.User"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="footer.jsp "%>
<%@include file="header.jsp"%>
<h1> User Update</h1>

<%
    User u =(User) session.getAttribute("user");

%>
<form method="post" action="updateUser">
    Username<input type="text" name="username" value="<%=u.getUsername()%>"/><br/>
    Password<input type="password" name="password" value="<%=u.getPassword()%>"/><br/>
    Email<input type="text" name="email" value="<%=u.getEmail()%>"/><br/>
    Gender<input type="radio" name="gender" value="male"<%= "male".equals(u.getGender())?"checked":""%>>Male
    <input type="radio=" name="gender" value="female"<%= "female".equals(u.getGender())?"checked":""%>>Female
    Birthday<input type="text name" name="BirthDate" value="<%=u.getBirthdate()%>"><br/>
    <input type="submit" value="Save Changes"/>

</form>