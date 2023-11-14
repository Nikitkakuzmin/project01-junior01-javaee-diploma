<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Rifles" %><%--
  Created by IntelliJ IDEA.
  User: Nikitka
  Date: 13.11.2022
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<div style="background-color: black; height: 1200px;">
<table border="1">
    <%
        ArrayList<Rifles> list = (ArrayList<Rifles>) request.getAttribute("list");
        if(list != null){
            for(Rifles rifle : list){

    %>
    <tr style="color: red">
        <td><%=rifle.getId()%></td>
        <td><%=rifle.getName()%></td>
        <td><%=rifle.getDescription()%></td>
        <td><%=rifle.getPrice()%></td>
        <td><%=rifle.getPhoto()%></td>
        <td><a style="color: red;" href="/rifledetails?id=<%=rifle.getId()%>">DETAILS</a> </td>
    </tr>
    </div>
    <%
            }
        }
    %>
</table>
</body>
</html>
