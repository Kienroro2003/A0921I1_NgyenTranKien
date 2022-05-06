<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 05/05/2022
  Time: 01:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Letter</title>
</head>
<body>
<h1>Letter</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${letters}" var="letter">
        <tr>
            <td>${letter.id}</td>
            <td>${letter.language}</td>
            <td>${letter.size}</td>
            <td>${letter.spamFilter}</td>
            <td>${letter.signature}</td>
            <td>
                <a href="/letter/update/${letter.id}">Setting</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
