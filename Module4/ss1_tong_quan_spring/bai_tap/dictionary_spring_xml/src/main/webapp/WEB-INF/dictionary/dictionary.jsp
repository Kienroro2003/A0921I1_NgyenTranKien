<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 25/04/2022
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/dictionary/getDictionary" method="get">
        <div class="form-group">
            <label for="eng">English: </label>
            <input  class="form-control" id="eng" name="eng" value="${eng}" placeholder="Enter english">
            <button type="submit" class="btn btn-primary" id="submit">Submit</button>
        </div>
    </form>
    <c:if test="${result != null}">
        <h1>Kết quả : ${result}</h1>
    </c:if>
</div>
</body>
</html>
