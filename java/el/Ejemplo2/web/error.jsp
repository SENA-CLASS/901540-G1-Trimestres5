<%-- 
    Document   : error
    Created on : 13/05/2016, 03:29:36 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%exception.getStackTrace();%> <br/>
    </body>
</html>
