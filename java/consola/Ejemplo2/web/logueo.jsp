<%-- 
    Document   : logueo
    Created on : 5/05/2016, 04:43:16 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="LogueoServlet" method="POST">
            <label>Tipo de documento</label>
            <input type="text" name="tipoDocumento"/><br>
            
            <label>Numero de Documento</label>
            <input type="text" name="numeroDocumento"/><br>
            
            <label>contraseña</label>
            <input type="password" name="password"/><br>
            <input type="submit" value="Enviar"/>
            
            
        </form>
    </body>
</html>
