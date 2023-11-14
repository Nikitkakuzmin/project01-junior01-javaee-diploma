<%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 21.11.2022
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>addFlamethrowers</title>
</head>
<body>
<div style="display: flex; justify-content: center; background-color: black; height: 100px;">
  <h1 style=" color: red;">ADD FLAMETHROWER</h1>
</div>
<form action="/addflame" method="post" style=" height: 1000px; background-color: black; color: red; ">
  <div style="display: flex;   height:50px; ">
    <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; ">NAME:</label>
    <input type="text" name="name" style="width:1500px; height:25px; margin-top: 10px; margin-left: 150px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
  </div>
  <div style="display: flex;  height:50px;margin-top: 20px;  ">
    <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; ">DESCRIPTION:</label>
    <input type="text" name="description" style="width:1500px; height:25px; margin-top: 10px; margin-left: 62px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
  </div>
  <div style="display: flex;  height:50px; margin-top: 20px; ">
    <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; ">PRICE:</label>
    <input type="text" name="price" style="width:1500px; height:25px; margin-top: 10px; margin-left: 153px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
  </div>
  <div style="display: flex;  height:50px;margin-top: 20px;  ">
    <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; ">PHOTO:</label>
    <input type="text" name="photo" style="width:1500px; height:25px; margin-top: 10px; margin-left: 141px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
  </div>
  <div style="margin-top: 20px;">
    <button type="submit" style="height: 100px; width: 100px; margin-left: 25px; margin-top: 20px; color: rgb(0,0,0);
            box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
            border-radius: 5%; font-size: 30px; border: 0px;">ADD</button>
  </div>
</form>

</body>
</html>
