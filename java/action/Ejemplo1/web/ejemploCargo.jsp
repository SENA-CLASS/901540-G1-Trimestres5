<%-- 
    Document   : ejemploCargo
    Created on : 11/05/2016, 04:37:07 PM
    Author     : hernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
    
        <jsp:useBean  id="cargo" class="edu.co.sena.ejemplo1.integracion.entites.Cargo" scope="request"/>
        <jsp:getProperty name="cargo" property="idCargo" />
        <jsp:getProperty name="cargo" property="descripcionCargo" />
        <jsp:getProperty name="cargo" property="estado" />
        
        
    </body>
</html>
