<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 01/05/2022
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form:form modelAttribute="login" action="login" method="post">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="account">Account: </form:label></td>
                <td><form:input path="account"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password: </form:label></td>
                <td><form:password  path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </fieldset>

</form:form>
</body>
</html>
