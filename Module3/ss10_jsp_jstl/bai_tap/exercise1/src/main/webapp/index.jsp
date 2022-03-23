<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 23/03/2022
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>$Title$</title>
  </head>
  <body>
  <h1>Danh sach khach hang</h1>
  <table class="table">
    <thead>
    <tr>
      <th scope="col">Ten</th>
      <th scope="col">Ngay sinh</th>
      <th scope="col">Dia chi</th>
      <th scope="col">Anh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
    <tr>
      <th scope="row">${list.name}</th>
      <td>${list.birthday}</td>
      <td>${list.address}</td>
      <td><img src="./Untitled-1.jpg" style="height: 50px" "></td>
    </tr>
    </c:forEach>
    </tbody>

  </table>
</table>
  </body>
</html>
