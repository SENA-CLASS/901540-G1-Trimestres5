<%-- 
    Document   : newjsp
    Created on : 17/05/2016, 03:04:56 PM
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
        <h1>Hello World!</h1>

        <h1>Header</h1><br/>
        <c:forEach items="${header}" var="a">
            ${a}<br/>
        </c:forEach>
        <h1>Cookies</h1><br/>
        <c:forEach items="${cookie}" var="a">
            ${a.value.getValue()}<br/>
        </c:forEach>
        sin foreach${cookie["JSESSIONID"].getValue()}

        <h1>Aplication Scope</h1><br/>
        <c:forEach items="${applicationScope}" var="a">
            ${a}<br/>
        </c:forEach>
            
            
            
    </body>
</html>
