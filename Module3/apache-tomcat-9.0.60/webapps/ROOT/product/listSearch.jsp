<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>List Search</title>
</head>
<body>
<h1>List Search</h1>
<a href="/product">Back to product list</a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Id</th>
        <th scope="col">Product Name</th>
        <th scope="col">Product Price</th>
        <th scope="col">Product Detail</th>
        <th scope="col">Producer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product" varStatus="c">
        <tr>
            <th scope="row">${c.count}</th>
            <td>${product.getProductId()} </td>
            <td>${product.getProductName()} </td>
            <td>${product.getPrice()} </td>
            <td>${product.getDetail()}</td>
            <td>${product.getProducer()} </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
