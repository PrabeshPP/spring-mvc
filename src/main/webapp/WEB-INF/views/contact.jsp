<%--
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
    %>
    <h1>You can contact us at:"<%=contact%>"</h1>
</body>
</html>
