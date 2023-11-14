<%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 21.11.2022
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <link rel="stylesheet" href="login.css">
</head>
<body>
<div class = "mainDiv">
  <div class="headLine">
    <form action="/lighthome" method="post" >
      <div class="shop" style="height: 70px; width: 200px;">
        <button style=" font-size: 20px; border: 0px; height: 70px; width: 200px;color: #ff0000; background-color: rgb(0,0,0);">Relicvarium</button>
      </div>
    </form>
    <div class="navbar" style="background-color: rgb(0, 0, 0);">
      <form action="https://www.youtube.com/watch?v=5QzpqCCdg-U" method="post" >
        <div class="topsales" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px; color: #ff0000; background-color: rgb(0,0,0);">Top Sales</button>
        </div>
      </form>
      <form action="https://www.youtube.com/watch?v=ip61uGZpE9g" method="post" >
        <div class="newsales" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">New Sales</button>
        </div>
      </form>
      <form action="/login" method="get" >
        <div class="category" style="height: 70px; width: 120px;">
          <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">My Cart</button>
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
  <div class="el infoDiv" style="border: 0px solid  rgb(212, 211, 211); width: 1900px; height:300px; margin-top: 50px;
    box-shadow: -1px -1px 12px 10px rgb(248,70,70);  border-radius: 1%; background-color: black; ">
    <form action="/login" method="post">
      <div style=" display: flex; height: 70px; background-color: red ; color:black;border-radius: 2%;">
        <h2 style="margin-left: 20px;">Login Page</h2>
      </div>
      <div class="mb-3" style= "display:flex;  height: 50px; width: 1900px; margin-top: 20px; background-color: black">
        <div style="display:flex; background-color: black">
          <label for="exampleInputEmail1" class="form-label" style="font-size: 30px; color: red; margin-top: 5px;
                    margin-left: 20px;">Email:</label>
        </div>
        <div>
          <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email"
                 style="height: 30px; width:1650px; margin-top: 5px; margin-left: 93px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
        </div>
      </div>
      <div class="mb-3" style= "display:flex;  height: 50px; width: 1900px; margin-top: 30px;">
        <div>
          <label for="exampleInputPassword1" class="form-label" style="font-size: 30px; color: red; margin-top: 5px;
                    margin-left: 20px;">Password:</label>
        </div>
        <div>
          <input type="password" class="form-control" id="exampleInputPassword1" name="password"
                 style="height: 30px; width:1650px; margin-top: 5px; margin-left: 50px;box-shadow: -1px -1px 12px 10px rgb(252,78,78);">
        </div>
      </div>
      <button type="submit" class="btn btn-primary" style="height: 40px; width: 130px; margin-left: 25px; color: rgb(0,0,0);
            box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
            border-radius: 5%; font-size: 15px; border: 0px;">Login</button>
    </form>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>