<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    success!<br>
    welcome:<br>
    user:${requestScope.user}
    pass:${requestScope.pass}

    <a href="/ShowServlet">Show All Employees...</a>
</body>
</html>
