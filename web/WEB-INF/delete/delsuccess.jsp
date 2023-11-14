<%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 22.11.2022
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="delsuccess.css">
</head>
<body>
<div class = "mainDiv">
    <div class="headLine" style="background-color: black;">
        <form action="/home" method="post" >
            <div class="shop" style="height: 70px; width: 120px;">
                <button style=" font-size: 20px; border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0);color: red;">Relicvarium</button>
            </div>
        </form>
        <div class="navbar">
            <form action="https://www.youtube.com/watch?v=5QzpqCCdg-U" method="post" >
                <div class="topsales" style="height: 70px; width: 120px;">
                    <button style="border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0);color: red;">Top Sales</button>
                </div>
            </form>
            <form action="https://www.youtube.com/watch?v=ip61uGZpE9g" method="post" >
                <div class="newsales" style="height: 70px; width: 120px;">
                    <button style="border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0);color: red;">New Sales</button>
                </div>
            </form>
            <form action="/cart" method="get" >
                <div class="category" style="height: 70px; width: 120px;">
                    <button style="border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0);color: red;">My cart</button>
                </div>
            </form>
            <form action="/regist" method="get" >
                <div class="regist" style="height: 70px; width: 120px;">
                    <button style="border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0);color: red;">Registration</button>
                </div>
            </form>
            <form action="/login" method="get" >
                <div class="Sign" style="height: 70px; width: 120px; ">
                    <button type="submit" style="border: 0px; height: 70px; width: 120px; background-color: rgb(0,0,0); color: red;">Sign in</button>
                </div>
            </form>
        </div>
    </div>
</div>
<div style=" background-color: black;">
<div style=" display: flex; justify-content: center;color: red;text-shadow: 0 0 10px #fc4e4e,0 0 20px #fc4e4e,0 0 30px #fc4e4e,0 0 40px red;">
    <h1>DELETE SUCCESS!</h1>
</div>
    <div style=" display: flex; justify-content: center;color:red; text-shadow: 0 0 10px #fc4e4e,0 0 20px #fc4e4e,0 0 30px #fc4e4e,0 0 40px red;">
        <h3>This is your profile page</h3>
    </div>
</div>
<canvas id="fire"></canvas>
<script src="../../salut.js"></script>
</body>
</html>