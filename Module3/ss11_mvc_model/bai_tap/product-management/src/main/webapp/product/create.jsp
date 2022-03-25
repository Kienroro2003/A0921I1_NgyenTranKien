<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/03/2022
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Create</title>
    <style>
        .message{
            color: forestgreen;
        }
    </style>
</head>
<body>
<h1>Create new a product</h1>
<c:if test="${message != null}">
    <p class="message">${message}</p>
</c:if>
<a href="/product">Back to Product List</a>
<form method="post">
    <div class="form-group">
        <label for="name">Product name</label>
        <input type="text" class="form-control" name="name" id="name" aria-describedby="emailHelp" placeholder="Enter name">
    </div>
    <div class="form-group">
        <label for="price">Product price</label>
        <input type="text" class="form-control" name="price" id="price" aria-describedby="emailHelp" placeholder="Enter price">
    </div>
    <div class="form-group">
        <label for="detail">Product detail</label>
        <input type="text" class="form-control" name="detail" id="detail" aria-describedby="emailHelp" placeholder="Enter detail">
    </div>
    <div class="form-group">
        <label for="producer">Producer</label>
        <input type="text" class="form-control" name="producer" id="producer" aria-describedby="emailHelp" placeholder="Enter producer">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
