<%-- 
    Document   : error
    Created on : 10/05/2016, 05:17:19 PM
    Author     : hernando
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.StringWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>error <%=exception.getMessage()%></h1>
        <%StringWriter sSalida=new StringWriter();
PrintWriter salida=new PrintWriter(sSalida);
exception.printStackTrace(salida);%>
<%=sSalida%>
    </body>
</html>
