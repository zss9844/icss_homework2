<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UpdateServlet" method="post">
    <input type="hidden" value="${param.index}" name="index">
    <input type="text" name="username" value="${param.user}" placeholder="请输入用户名"><br>
    <input type="password" name="password" value="${param.pass}" placeholder="请输入密码"><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
