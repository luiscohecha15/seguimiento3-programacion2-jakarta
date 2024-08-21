<%--
  Created by IntelliJ IDEA.
  User: luisc
  Date: 14/08/2024
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Ingreso correcto</title>
</head>
<body>
<table style="with: 50%">
    <tr>
        <td>
            <!-- Se toman ls valores que viene y se asignan a una variable -->
            <% String usuario = request.getParameter("textUsuario "); %>
            <% String apellido = request.getParameter("textApellido"); %>
            <!-- Se concatena HTML con codigo Java -->
            <a>Bienvenid@ <%=usuario %> Su inicio de sesión es correcto!</a>
        </td>
    </tr>
    <tr></tr>
    <tr><td>
        <a href="index.jsp"><b>Cerrar sesión</b></a>
    </td>
    </tr>
</table>
</body>
</html>
