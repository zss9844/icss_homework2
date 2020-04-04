<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.icss.day_04.pojo.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="400" border="1" cellpadding="10" cellspacing="0">
    <c:set value="0" scope="page" var="index"></c:set>
    <tr>
        <td>Flowid</td>
        <td>Type</td>
        <td>Idcard</td>
        <td>Examcard</td>
        <td>StudentName</td>
        <td>Location</td>
        <td>Grade</td>
    </tr>
    <c:forEach items="${requestScope.emps}" var="e">
        <tr>
            <td>${e.flowid}</td>
            <td>${e.type}</td>
            <td>${e.idcard}</td>
            <td>${e.examcard}</td>
            <td>${e.studentname}</td>
            <td>${e.location}</td>
            <td>${e.grade}</td>

        </tr>
        <c:set value="${pageScope.index+1}" scope="page" var="index"></c:set>
    </c:forEach>
</table>
<br>
<a href="add.jsp">Add Employees...</a>
</body>
</html>
