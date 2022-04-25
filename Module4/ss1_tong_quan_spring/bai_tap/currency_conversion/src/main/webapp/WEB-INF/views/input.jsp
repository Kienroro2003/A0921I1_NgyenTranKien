<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/04/2022
  Time: 04:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.1/js/bootstrap.min.js"
            integrity="sha512-UR25UO94eTnCVwjbXozyeVd6ZqpaAE9naiEUBK/A+QDbfSTQFhPGj5lOR6d8tsgbBk84Ggb5A3EkjsOgPRPcKA=="
            crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/views/convert" method="get">
        <div class="form-group">
            <label for="usd">USD: </label>
            <input  class="form-control" id="usd" name="usd" value="0" placeholder="Enter usd">
        </div>
        <div class="form-group">
            <label for="rate">VND: </label>
            <input type="text" class="form-control" name="rate" id="rate" value="23000" placeholder="Enter usd" >
        </div>
        <button type="submit" class="btn btn-primary" id="submit">Submit</button>
    </form>
    <h1>VND: ${vnd}</h1>
</div>
</body>
</html>
