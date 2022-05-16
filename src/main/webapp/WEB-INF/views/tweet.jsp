<%--
  Created by IntelliJ IDEA.
  User: prabe
  Date: 5/16/2022
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .box1{
            height: 20vh;
            width: 50%;
            background-color: darkgreen;
            border-radius: 12px;
        }
    </style>
</head>
<body>

        <form action="tweets" method="post">
            <input type="text" class="box1" name="txt" />
            <button>Save</button>
        </form>



</body>
</html>
