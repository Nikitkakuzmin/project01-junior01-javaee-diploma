<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Pistols" %><%--
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
        ArrayList<Pistols> list = (ArrayList<Pistols>) request.getAttribute("list");
        if(list != null){
            for(Pistols pistol : list){

    %>
        <tr style="color: red">
            <td><%=pistol.getId()%></td>
            <td><%=pistol.getName()%></td>
            <td><%=pistol.getDescription()%></td>
            <td><%=pistol.getPrice()%></td>
            <td><%=pistol.getPhoto()%></td>
            <td><a style="color: red;" href="/pistoldetails?id=<%=pistol.getId()%>">DETAILS</a> </td>
        </tr>
</div>
<%
        }
    }
%>
</table>
</body>
</html>
