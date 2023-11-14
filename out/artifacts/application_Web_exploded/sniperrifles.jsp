<%@ page import="kz.kuzmin.javaee.guns.Sniperrifles" %>
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
    <title>Sniperrifles</title>
    <link rel="stylesheet" href="ammo.css">
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
            <form action="/addsniper" method="get" >
                <div class="category" style="height: 70px; width: 120px;">
                    <button style="border: 0px; height: 70px; width: 120px;color: #ff0000; background-color: rgb(0,0,0);">ADD</button>
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

    <div class="tovary" >
        <div class="flex-container" style="background-color: black; ">
            <%
                ArrayList<Sniperrifles> list = (ArrayList<Sniperrifles>) request.getAttribute("list");
                if(list != null){
                    for(Sniperrifles sniperrifle : list){
            %>
            <div class = "tovar" style=" display: flex;   width:1880px;height: 600px;">
                <div class="left" style="border: 1px solid black; width: 500px; height: 500px;margin-top: 50px;">
                    <div class="name" style=" display: flex; border:1px solid black; width: 500px; height: 120px;">
                        <h1 class="card-title" style="margin-left: 110px; margin-top: 40px; color: red">
                            <%=sniperrifle.getName()%></h1>
                    </div>
                    <div  class="price" style=" display: flex;  width: 500px; height: 120px;">
                        <h1 class="card-title"  style="margin-left: 110px; margin-top: 40px; color: #fc4e4e; text-shadow: 0 0 10px #fc4e4e,0 0 20px #fc4e4e,0 0 30px #fc4e4e,0 0 40px red;">
                            <%=sniperrifle.getPrice()%> $$$</h1>
                    </div>
                    <div class="button" style="display: flex;">
                        <form action="/cookie" method="post">
                            <button  class="btn btn-primary"  style="height: 200px; width: 200px; margin-left: 25px; color: rgb(0,0,0);
                        box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
                        border-radius: 5%; font-size: 30px; border: 0px;">BUY</button>
                        </form>
                        <form action="/viewsniper">
                            <button style="height: 200px; width: 200px; margin-left: 25px; color: rgb(0,0,0);
                                box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
                                border-radius: 5%; font-size: 30px; border: 0px;">DETAILS</button>
                        </form>
                    </div>
                </div>
                <div class="centr" style="  width: 500px; height: 500px; color: red; font-size: 25px; margin-top: 50px;">
                    <p class="text" ><td>
                    <%=sniperrifle.getDescription()%></td></p>
                </div>
                <div class="photo" style="  width: 900px; height: 500px; margin-top: 50px;">
                    <img style="height: 500px; width: 900px;" src=<%=sniperrifle.getPhoto()%> >
                </div>
            </div>
            <%
                    }
                }
            %>

        </div>
    </div>
</div>

</body>
</html>

