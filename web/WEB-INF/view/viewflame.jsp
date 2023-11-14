<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Flamethrowers" %><%--
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
        ArrayList<Flamethrowers> list = (ArrayList<Flamethrowers>) request.getAttribute("list");
        if(list != null){
            for(Flamethrowers flamethrower : list){

    %>
    <tr style="color: red">
      <td><%=flamethrower.getId()%></td>
      <td><%=flamethrower.getName()%></td>
      <td><%=flamethrower.getDescription()%></td>
      <td><%=flamethrower.getPrice()%></td>
      <td><%=flamethrower.getPhoto()%></td>
      <td><a style="color: red;" href="/flamedetails?id=<%=flamethrower.getId()%>">DETAILS</a> </td>
    </tr>
</div>
<%
    }
  }
%>
</table>
</body>
</html>
