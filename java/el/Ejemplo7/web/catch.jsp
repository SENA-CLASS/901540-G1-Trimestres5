<%-- 
    Document   : catch
    Created on : 23/05/2016, 03:33:34 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:catch var ="catchException">
        <% int x = 5 / 1;%>
    </c:catch>

    <c:if test = "${catchException != null}">
        <p>The exception is : ${catchException} <br />
            There is an exception: ${catchException.message}</p>
    </c:if>
        
        <c:out value="${'<tag> , &'}"/>
        
        

</body>
</html>
