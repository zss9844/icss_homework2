<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<font color="red">${sessionScope.msg}</font>
<form action="/ValidateServlet" method="post">
    <input type="text" name="username" placeholder="请输入用户名"><br>
    <input type="password" name="password" placeholder="请输入密码"><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
