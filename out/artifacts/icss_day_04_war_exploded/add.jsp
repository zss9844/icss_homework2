<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/7 0007
  Time: 上午 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/AddServlet" method="post">
    <input type="text" name="type" placeholder="请输入type"><br>
    <input type="text" name="idcard" placeholder="请输入idcard"><br>
    <input type="text" name="examcard" placeholder="请输入examcard"><br>
    <input type="text" name="studentname" placeholder="请输入studentname"><br>
    <input type="text" name="location" placeholder="请输入location"><br>
    <input type="text" name="grade" placeholder="请输入grade"><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
