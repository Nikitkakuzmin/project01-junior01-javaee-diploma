<%@ page import="kz.kuzmin.javaee.guns.Flamethrowers" %><%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 16.11.2022
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>UpdateItem</title>
</head>
<body>
<div style="display: flex; justify-content: center; background-color: black; height: 100px;">
  <h1 style=" color: red;">UPDATE FLAMETHROWER</h1>
</div>
<div class="mainDiv">
  <%
    Flamethrowers flamethrower = (Flamethrowers) request.getSession().getAttribute("flamethrower");
  %>
  <form action="/flameupdate" method="post" style=" height: 1000px; background-color: black; color: red; ">
    <div>
      <label for="exampleInputId" class="form-label" >ID</label>
      <input type="hidden" class="form-control" id="exampleInputId" aria-describedby="emailHelp" value="<%=flamethrower.getId()%>" name="id">
    </div>
    <div style="display: flex;   height:50px; ">
      <label   style=" font-size:25px; margin-top: 10px; margin-left: 20px;" for="exampleInputName1"  class="form-label" >NAME:</label>
      <input type="text" class="form-control" id="exampleInputName1"  name="name"
             style="width:1500px; height:25px; margin-top: 10px; margin-left: 150px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
    </div>
    <div style="display: flex;  height:50px;margin-top: 20px;  ">
      <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; " for="exampleInputDescription1" class="form-label">DESCRIPTION:</label>
      <input type="text" class="form-control" id="exampleInputDescription1" name="description"
             style="width:1500px; height:25px; margin-top: 10px; margin-left: 62px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
    </div>
    <div style="display: flex;  height:50px;margin-top: 20px;" >
      <label style=" font-size:25px; margin-top: 10px; margin-left: 20px; " for="exampleInputPrice" class="form-label">PRICE:</label>
      <input type="text" class="form-control" id="exampleInputPrice" name="price"
             style="width:1500px; height:25px; margin-top: 10px; margin-left: 153px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
    </div>
    <div style="display: flex;  height:50px;margin-top: 20px;">
      <label   style=" font-size:25px; margin-top: 10px; margin-left: 20px; " for="exampleInputPhoto1"  class="form-label" >PHOTO:</label>
      <input type="text" class="form-control" id="exampleInputPhoto1"  name="photo"
             style="width:1500px; height:25px; margin-top: 10px; margin-left: 141px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
    </div>
    <button type="submit" class="btn btn-primary"
            style="height: 100px; width: 100px; margin-left: 25px; margin-top: 20px; color: rgb(0,0,0);
            box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
            border-radius: 5%; font-size: 20px; border: 0px;">UPDATE</button>
  </form>
</div>

</body>
</html>
