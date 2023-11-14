<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Shotguns" %><%--
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
        ArrayList<Shotguns> list = (ArrayList<Shotguns>) request.getAttribute("list");
        if(list != null){
            for(Shotguns shotgun : list){

    %>
        <tr style="color: red">
            <td><%=shotgun.getId()%></td>
            <td><%=shotgun.getName()%></td>
            <td><%=shotgun.getDescription()%></td>
            <td><%=shotgun.getPrice()%></td>
            <td><%=shotgun.getPhoto()%></td>
            <td><a style="color: red;" href="/shotdetails?id=<%=shotgun.getId()%>">DETAILS</a> </td>
        </tr>
</div>
<%
        }
    }
%>
</table>
</body>
</html>
