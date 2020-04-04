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
<form action="/QueryServlet" method="post">
    <p>Query</p>
    <select name="query">
        <option value="id">身份证号</option>
        <option value="zkz">准考证号</option>
    </select>
    <input type="text" name="num" placeholder="请输入信息"><br>
    <input type="submit" value="OK">
</form>
</body>
</html>
