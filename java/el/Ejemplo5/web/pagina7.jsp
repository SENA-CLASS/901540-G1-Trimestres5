<%-- 
    Document   : pagina7
    Created on : 20/05/2016, 03:27:30 PM
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
        ${param.boton== "par" ? "escogio el boton par": "escogio el boton impar"}<br/>
        ${param.boton== "par" ? ((param.campo1 % 2)== 0 ? "es par": "es impar"): ((param.campo1 % 2)== 1 ? "es impar": "es par")}
    </body>
</html>
