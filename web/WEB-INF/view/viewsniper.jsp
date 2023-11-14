<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Sniperrifles" %><%--
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
        ArrayList<Sniperrifles> list = (ArrayList<Sniperrifles>) request.getAttribute("list");
        if(list != null){
            for(Sniperrifles sniperrifle : list){

    %>
        <tr style="color: red">
            <td><%=sniperrifle.getId()%></td>
            <td><%=sniperrifle.getName()%></td>
            <td><%=sniperrifle.getDescription()%></td>
            <td><%=sniperrifle.getPrice()%></td>
            <td><%=sniperrifle.getPhoto()%></td>
            <td><a style="color: red;" href="/sniperdetails?id=<%=sniperrifle.getId()%>">DETAILS</a> </td>
        </tr>
</div>
<%
        }
    }
%>
</table>
</body>
</html>
