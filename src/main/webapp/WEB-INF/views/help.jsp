<%--
  Created by IntelliJ IDEA.
  User: prabe
  Date: 5/13/2022
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>This is Help Page.</h1>

    <%
    String name=(String)request.getAttribute("name");
    %>

    <h1><%=name%></h1>
</body>
</html>
