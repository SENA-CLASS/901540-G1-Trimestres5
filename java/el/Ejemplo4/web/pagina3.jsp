<%-- 
    Document   : pagina3
    Created on : 18/05/2016, 04:02:55 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String a = "hola a";    
        %>
        <c:set var="b" scope="page" value="hola b" />
        
        <c:out value="${pageScope.a}" default="null" />
        <c:out value="${pageScope.b}" default="null" />
        ${pageScope.a}
        ${pageScope.b}
    </body>
</html>
