<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 01/05/2022
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>ID</td>
        <td>${employee.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${employee.name}</td>
    </tr>
    <tr>
        <td>Contact Number</td>
        <td>${employee.contactNumber}</td>
    </tr>
</table>
</body>
</html>
