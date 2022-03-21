<%--
  Created by IntelliJ IDEA.
  User: kienroro2003
  Date: 21/03/2022
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form action="/display-discount" method="post">
  <label for ="product-description">Mo ta cua san pham</label>
  <input type = "text" id="product-description" name = "product-description" >
  <label for ="list-price">Gia niem yet cua san pham</label>
  <input type="text" id="list-price" name = "list-price" >
  <label for ="discount-percent">ti le chiet khau</label>
  <input type="text" id="discount-percent" name = "discount-percent" >
  <input type="submit" id="submit" value="button">
</form>
  </body>
</html>
