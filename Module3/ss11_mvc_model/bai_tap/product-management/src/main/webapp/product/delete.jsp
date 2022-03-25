<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Delete</title>
    <style>
        .message {
            color: forestgreen;
        }
    </style>
</head>
<body>
<h1>Delete Product</h1>
<a href="/product">Back to product list</a>
<c:if test="${message != null}">
    <p class="message">${message}</p>
</c:if>
<p>Are you sure?</p>
<form method="post">

    <table>
        <tr>
            <td>Id:</td>
            <td>${requestScope['product'].getProductId()}</td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>${requestScope['product'].getProductName()}</td>
        </tr>
        <tr>
            <td>Price:</td>
            <td>${requestScope['product'].getPrice()}</td>
        </tr>
        <tr>
            <td>Detail:</td>
            <td>${requestScope['product'].getDetail()}</td>
        </tr>
        <tr>
            <td>Producer:</td>
            <td>${requestScope['product'].getProducer()}</td>
        </tr>

    </table>
    <button type="submit">Enter</button>
</form>
</body>
</html>
