<%-- 
    Document   : pagina2
    Created on : 12/05/2016, 02:32:26 PM
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
        <%= request.getParameter("campo1") %>
        ${param.campo1}
    </body>
</html>
