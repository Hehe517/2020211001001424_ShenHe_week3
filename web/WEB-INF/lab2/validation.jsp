
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<jsp:useBean id="login" class="lab2.Login" scope="request">
    <jsp:setProperty name="login" property="username" value="${param.username}"/>
    <jsp:setProperty name="login" property="password" value="${param.password}"/>
</jsp:useBean>

<%
    if(login.getUsername().equals("admin")&&login.getPassword().equals("admin")) {
%>
<jsp:forward page="welcome.jsp"/>
<%
}
else {
%>
<c:out value="username or password error"/>
<jsp:include page="login.jsp" flush="false"/>
<%
    }
%>
</body>
</html>
