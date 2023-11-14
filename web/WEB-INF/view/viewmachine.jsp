<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.kuzmin.javaee.guns.Machineguns" %><%--
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
        ArrayList<Machineguns> list = (ArrayList<Machineguns>) request.getAttribute("list");
        if(list != null){
            for(Machineguns machinegun : list){

    %>
    <tr style="color: red">
      <td><%=machinegun.getId()%></td>
      <td><%=machinegun.getName()%></td>
      <td><%=machinegun.getDescription()%></td>
      <td><%=machinegun.getPrice()%></td>
      <td><%=machinegun.getPhoto()%></td>
      <td><a style="color: red;" href="/machinedetails?id=<%=machinegun.getId()%>">DETAILS</a> </td>
    </tr>
</div>
<%
    }
  }
%>
</table>
</body>
</html>
