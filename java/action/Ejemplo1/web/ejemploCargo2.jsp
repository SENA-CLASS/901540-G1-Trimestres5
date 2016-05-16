<%-- 
    Document   : ejemploCargo2
    Created on : 11/05/2016, 04:45:55 PM
    Author     : hernando
--%>

<%@page import="edu.co.sena.ejemplo1.integracion.entites.Cargo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% request.getRequestDispatcher("CargoServlet").include(request, response);
        Cargo cargo = (Cargo)request.getAttribute("cargo");
        out.print(cargo.getIdCargo());
        %>
        
    </body>
</html>
