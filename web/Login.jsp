<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week5_homework_login</title>
</head>
<body>
<h1>Login</h1>
<% if(!(request.getAttribute("message")==null)){
    out.println(request.getAttribute("message"));
}%>
<form method="post" action="/Login">
    Username<input type="text" name="username"/><br/>
    Password<input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>

</form>

</body>
</html>