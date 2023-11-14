<%@ page import="kz.kuzmin.javaee.guns.Pistols" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.11.2022
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>

<body>
<div class="mainDiv">
        <%
        Pistols pistol = (Pistols) request.getSession().getAttribute("pistol");
        if(pistol != null){
    %>
    <div class="tovary">
        <div class="flex-container" style="background-color: black;height: 1000px;">
            <div class = "tovar" style=" display: flex;   width:1880px;height: 600px;">
                <div class="left" style="border: 1px solid black; width: 500px; height: 500px;margin-top: 50px;">
                    <div class="name" style=" display: flex; border:1px solid black; width: 500px; height: 120px;">
                        <h1 class="card-title" style="margin-left: 110px; margin-top: 40px; color: red">
                            <%=pistol.getName()%></h1>
                    </div>
                    <div  class="price" style=" display: flex;  width: 500px; height: 120px;">
                        <h1 class="card-title"  style="margin-left: 110px; margin-top: 40px; color: red">
                            <%=pistol.getPrice()%> $$$</h1>
                    </div>
                    <div class="button" style="display: flex;">
                        <form action="/pistolupdate" method="get">
                            <input type="hidden" value="<%=pistol.getId()%>" name="id">
                            <button class="btn btn-primary" style="height: 200px; width: 200px; margin-left: 25px; margin-top: 20px; color: rgb(0,0,0);
            box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
            border-radius: 5%; font-size: 30px; border: 0px;">UPDATE</button>
                        </form>
                        <form action="/pistoldelete" method="post">
                            <input type="hidden" value="<%=pistol.getId()%>" name="id">
                            <button class="btn btn-primary" style="height: 200px; width: 200px; margin-left: 25px; margin-top: 20px; color: rgb(0,0,0);
            box-shadow: -1px -1px 12px 10px rgb(252,78,78); margin-top: 20px ; background-color: rgb(255,0,0);
            border-radius: 5%; font-size: 30px; border: 0px;">DELETE</button>
                        </form>
                    </div>
                </div>
                <div class="centr" style="  width: 500px; height: 500px; color: red; font-size: 25px; margin-top: 50px;">
                    <p class="text" ><td>
                    <%=pistol.getDescription()%></td></p>
                </div>
                <div class="photo" style="  width: 900px; height: 500px; margin-top: 50px;">
                    <img style="height: 500px; width: 900px;" src=<%=pistol.getPhoto()%> >
                </div>
            </div>
        </div>
        <%
            }
        %>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
