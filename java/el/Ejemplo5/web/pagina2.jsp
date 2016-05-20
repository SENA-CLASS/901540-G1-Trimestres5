<%-- 
    Document   : pagina2
    Created on : 19/05/2016, 03:07:53 PM
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
        <h1>${param.campo1 += " " += param.campo2}</h1>
        <h1>${empty param.campo2}</h1>
        <h1>${param.campo1 == param.campo2 ? "verdadero" : "falso"}</h1>
        
        <c:set var="a" value="uno" scope="page"/>
        <c:set var="b" value="dos" scope="page"/>
        <h1>${pageScope.a ; pageScope.b}</h1>
        
    </body>
</html>
