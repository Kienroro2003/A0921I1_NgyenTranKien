<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 05/05/2022
  Time: 01:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/letter">Back to list</a>
<form:form method="post" action="/letter/update" modelAttribute="letter">
    <table>
        <tr>
            <td><form:hidden path="id"></form:hidden></td>
        </tr>
        <tr>
            <td>Languages</td>
            <td><form:select path="language" items="${languages}" ></form:select></td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td><form:select path="size" items="${pageSizes}"></form:select></td>
        </tr>
        <tr>
            <td>Spams filter</td>
            <td><form:checkbox path="spamFilter"></form:checkbox> Enable spams filter</td>
        </tr>
        <tr>
            <td>Signature</td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
