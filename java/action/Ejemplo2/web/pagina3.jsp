<%-- 
    Document   : pagina3
    Created on : 12/05/2016, 02:40:48 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Servlet1"/>
        
        <% 
        config.getInitParameter("nombre");
        
        %>
    </body>
</html>
