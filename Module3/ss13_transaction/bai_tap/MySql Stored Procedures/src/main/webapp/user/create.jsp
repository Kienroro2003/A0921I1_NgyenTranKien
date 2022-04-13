<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 04/04/2022
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Create</h1>
<c:if test="${mess != null}">
    <p>${mess}</p>
</c:if>
<a href="/users">Back to list</a>
<form method="post">
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="name">Name</span>
        </div>
        <input type="text" class="form-control" name="name"">
    </div>
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="email">Email</span>
        </div>
        <input type="text" class="form-control" name="email" ">
    </div>
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <span class="input-group-text" id="country">Country</span>
        </div>
        <input type="text" class="form-control" name="country"">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
