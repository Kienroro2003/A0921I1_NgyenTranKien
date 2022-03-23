<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 23/03/2022
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="converter.jsp" method="post">
    <label for="rate">Rate: </label>
    <input type="text" name="rate" id="rate" placeholder="Rate" value="20000">
    <br>
    <label for="usd">USD: </label>
    <input type="text" name="usd" id="usd" placeholder="USA" value="0"/>
    <br>
    <input type="submit" id="submit" value="Converter">
  </form>
  </body>
</html>
