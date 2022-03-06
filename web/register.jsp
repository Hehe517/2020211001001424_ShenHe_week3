<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/6
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week2_homework</title>
</head>
<body>

<form method="post" action="/register">
    Username<input type="text" name="username"/><br/>
    Password<input type="password" name="password"/><br/>
    Email<input type="text" name="email"/><br/>
    Gender<input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    Birthday<input type="text name" name="BirthDate"/><br/>
    <input type="submit" value="Register"/>

</form>

</body>
</html>