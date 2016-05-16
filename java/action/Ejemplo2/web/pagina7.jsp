<%-- 
    Document   : pagina7
    Created on : 12/05/2016, 03:51:52 PM
    Author     : hernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="a" begin="1" end="10">
            ${a} * 5 = ${a*5}<br/>
        </c:forEach>
            
            ${'${'}2 + 2 } ${2 + 2}
      
    </body>
</html>
