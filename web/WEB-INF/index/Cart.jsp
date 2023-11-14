
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 21.11.2022
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>cart</title>
  <link rel="stylesheet" href="../guns/ammo.css">
</head>
<body>
<div class = "mainDiv">
  <div class="headLine">
    <form action="/home" method="post" >
      <div class="shop" style="height: 70px; width: 200px;">
        <button style=" font-size: 20px; border: 0px; height: 70px; width: 200px;color: #ff0000; background-color: rgb(0,0,0);">Relicvarium</button>
      </div>
    </form>
    <div class="navbar" style="background-color: rgb(0, 0, 0);">
      <form action="/" method="post" >
        <div class="topsales" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px; color: #ff0000; background-color: rgb(0,0,0);">Top Sales</button>
        </div>
      </form>
      <form action="/" method="post" >
        <div class="newsales" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">New Sales</button>
        </div>
      </form>
      <form action="/cart" method="get" >
        <div class="category" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">My cart</button>
        </div>
      </form>
      <form action="/regist" method="get" >
        <div class="regist" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">Registration</button>
        </div>
      </form>
      <form action="/login" method="get" >
        <div class="Sign" style="height: 70px; width: 120px;">
          <button type="submit" style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">Sign in</button>
        </div>
      </form>
    </div>
  </div>
  <%
    String tovar= request.getAttribute("tovar").toString();
  %>
  <div class="tovary"><%=tovar%></div>
</div>

</body>
</html>