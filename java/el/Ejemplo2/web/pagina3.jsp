<%-- 
    Document   : pagina3
    Created on : 13/05/2016, 04:54:10 PM
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
        <jsp:include page="Servlet3"/>
        <jsp:useBean id="mapaObjeto" class="java.util.Map" scope="request"/>
        <c:forEach items="${mapaObjeto.keySet()}" var="var1">
            
            lugar: ${mapaObjeto.get(var1).nombre} esta ubicado en:<br/>
            longitud: ${var1.longitud}<br>
            latitud: ${var1.latitud}<br>
            </c:forEach>
    </body>
</html>
