<%-- 
    Document   : paigna1
    Created on : 13/05/2016, 03:24:12 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Servlet1"/>
        <jsp:useBean id="libros" scope="request" class="java.lang.String[]" />
        ${libros[0]}
        ${libros[1]}
        ${libros[2]}
        ${libros[3]}
        ${libros[4]}
    </body>
</html>
