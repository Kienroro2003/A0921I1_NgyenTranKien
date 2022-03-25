<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>List</title>
</head>
<body>
<h1>List Product</h1>
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="/product?action=create">Create new a product</a>
</nav>
<nav class="navbar navbar-light bg-light hover">
    <a class="navbar-brand" href="/product?action=search">Search product</a>
</nav>
<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Id</th>
        <th scope="col">Product Name</th>
        <th scope="col">Product Price</th>
        <th scope="col">Product Detail</th>
        <th scope="col">Producer</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product" varStatus="c">
        <tr>
            <th scope="row">${c.count}</th>
            <td>${product.getProductId()} </td>
            <td><a href="/product?action=view&id=${product.getProductId()}">${product.getProductName()}</a> </td>
            <td>${product.getPrice()} </td>
            <td>${product.getDetail()}</td>
            <td>${product.getProducer()} </td>
            <td><a href="/product?action=edit&id=${product.getProductId()}">Edit</a> </td>
            <td><a href="/product?action=delete&id=${product.getProductId()}">Delete</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
