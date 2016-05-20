<%-- 
    Document   : index
    Created on : 18/05/2016, 03:13:22 PM
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
        <form action="Servlet1" method="POST">
            <input type="text" name="serial"/>
            <input type="text" name="marca"/>
            <input type="text" name="precio"/>
            <input type="submit" value="agregar"/>
            
        </form>
    </body>
</html>
