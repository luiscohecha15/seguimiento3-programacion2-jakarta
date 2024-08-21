<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Formulario de registro</title>
</head>
<body>
<!-- Se hace un formulario de HTML normal -->
<h1>Formulario para registro de usuarios.</h1>
<form action="registro" method="post">
    <table style="with: 50%">
        <tr>
            <td>Nombres:</td>
            <td><input type="text" name="textNombre" id="textNombre" /></td>
        </tr>
        <tr>
            <td>Apellidos:</td>
            <td><input type="text" name="textApellido" id="textApellido" /></td>
        </tr>
        <tr>
            <td>Usuario:</td>
            <td><input type="text" name="textUsuario" id="textUsuario" /></td>
        </tr>
        <tr>
            <td>Contraseña:</td>
            <td><input type="password" name="passContrasena" id="passContrsena" /></td>
        </tr>
        <tr>
            <td>Dirección</td>
            <td><input type="text" name="textDireccion" id="textDireccion"/></td>
        </tr>
        <tr>
            <td>Movíl nro:</td>
            <td><input type="text" name="textMovil" id="textMovil"/></td>
        </tr></table>
    <input type="submit" value="Registrar" /></form>
</body>
</html>
