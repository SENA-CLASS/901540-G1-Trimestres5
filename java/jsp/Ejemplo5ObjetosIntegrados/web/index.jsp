<%-- 
    Document   : index
    Created on : 10/05/2016, 02:49:07 PM
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
        <h1>Hello World!</h1>
        <%
            javax.servlet.http.HttpServlet servlet = (HttpServlet) page;
             exception = new ArithmeticException("prueba");
        HttpSession session2 =pageContext.getSession();
        if(session.equals(session2)){
        out.println("son iguales");
        }else{
        out.println("son diferentes");
        }
        
        %>
    </body>
</html>
