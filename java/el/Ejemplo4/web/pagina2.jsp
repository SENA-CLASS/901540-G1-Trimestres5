<%-- 
    Document   : pagina2
    Created on : 18/05/2016, 03:35:10 PM
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
        <c:forEach items="${applicationScope.relojes}" var="reloj">
            ${reloj.serial}
            ${reloj.marca}
            ${reloj.precio}
            
        </c:forEach>
    </body>
</html>
