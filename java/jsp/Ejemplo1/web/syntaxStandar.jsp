<%-- 
    Document   : syntaxStandar
    Created on : 4/05/2016, 05:43:47 PM
    Author     : hernando
--%>

<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="java.util.Date" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- <h1>Hello World!</h1> -->
        <%--
        <br>
        
        --%>
        <% try { %>

        <%int a;

            //a= 3%5;
            for (int i = 1; i <= 10; i++) {

                out.println("5 * " + i + " = " + (5 * i) + "<br>");
            }
             List<Object> coleccion = new ArrayList<>();

        %>
        <%=new String("%")%>
        <%= "Joe said %\\>"%>
        <%= "Joe said \" %\\>"%>

        <%} catch (Exception e) {

            }%>




    </body>
</html>
