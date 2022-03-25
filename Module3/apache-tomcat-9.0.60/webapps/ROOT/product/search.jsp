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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Search</title>
</head>
<body>
<h1>Search</h1>
<a href="/product">Back to product list</a>
<form method="post">
    <div class="form-group">
        <label for="search">Search by name</label>
        <input type="text" class="form-control" name="search" id="search" aria-describedby="emailHelp" placeholder="Enter name">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
</body>
</html>
