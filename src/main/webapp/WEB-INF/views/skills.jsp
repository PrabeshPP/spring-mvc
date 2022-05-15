<%--
  Created by IntelliJ IDEA.
  User: prabe
  Date: 5/15/2022
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>My Skills</h1>
<% String[] arr=request.getParameterValues("list"); %>
<% for(int i=0;i<arr.length;i++){
    %>
    <h4><%=arr[i]%></h4>
   <%
}%>
</body>
</html>
