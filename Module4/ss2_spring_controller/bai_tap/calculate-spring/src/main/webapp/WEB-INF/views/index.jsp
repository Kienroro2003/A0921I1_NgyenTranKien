<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 01/05/2022
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculate</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  </head>
  <body>
  <h1>Calculate</h1>
  <form action="${pageContext.request.contextPath}/views/result" method="get">
    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="Number 1" name="num1"/>
    </div>
    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="Number 2" name="num2" >
    </div>
    <button type="submit" class="btn btn-primary" name="calculator" value="+">Addition(+)</button>
    <button type="submit" class="btn btn-primary" name="calculator" value="-">Subtraction(-)</button>
    <button type="submit" class="btn btn-primary" name="calculator" value="*">Multiplication(*)</button>
    <button type="submit" class="btn btn-primary" name="calculator" value="/">Division(/)</button>
  </form>
  <h2>Result Division: ${result}</h2>
  </body>
</html>
