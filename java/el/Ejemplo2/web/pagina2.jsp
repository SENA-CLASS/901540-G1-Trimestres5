<%-- 
    Document   : pagina2
    Created on : 13/05/2016, 03:42:42 PM
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
        <jsp:include page="Servlet2"/>
        <jsp:useBean id="libros" scope="request" class="java.util.Map" />
        <h2>aca imprimo los libros usando el []<br/></h2>
        ${libros["java"]}<br/>
        ${libros[".net"]}<br/>
        ${libros["Python"]}<br/>
        ${libros["go"]}<br/>
        
        
        <h2>aca imprimo los libros usando el operador punto (.)<br/></h2>
        ${libros.java}<br/>
        ${libros.net}<br/>
        ${libros.Python}<br/>
        ${libros.go}<br/>
        
        <h2>aca imprimo los libros usando el action c:forEach<br/></h2>
        <c:forEach var="map" items="${libros}" >
            ${map}<br/>
        </c:forEach>
        
        
        <h2>aca imprimo los libros usando el action c:forEach<br/></h2>
        <c:forEach var="set" items="${libros.keySet()}" >
        Key: ${set}<br/>
        Value: ${libros[set]}<br/>
        </c:forEach>
        
        
        
        
        
    </body>
</html>
