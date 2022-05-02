<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 01/05/2022
  Time: 08:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu spice sandwich</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1>Menu spice</h1>
<form action="${pageContext.request.contextPath}/views/save">
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="lettuce" id="lettuce">
        <label class="form-check-label" for="lettuce">
            Lettuce
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="tomato" id="sprouts">
        <label class="form-check-label" for="sprouts">
            Sprouts
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="tomato" id="tomato">
        <label class="form-check-label" for="tomato">
            Tomato
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="condiment" value="tomato" id="mustard">
        <label class="form-check-label" for="mustard">
            Mustard
        </label>
    </div>
    <input type="submit" value="Submit">
</form>
<h2>Condiment: ${condiments} </h2>
</body>
</html>
