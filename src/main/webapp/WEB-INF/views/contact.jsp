<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: prabe
  Date: 5/13/2022
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String contact=(String)request.getAttribute("number");
        LocalDateTime now=(LocalDateTime) request.getAttribute("date");
    %>
    <h1>You can contact us at:"<%=contact%>"</h1>
    <h4>Current time is:<%=now%></h4>
</body>
</html>
