<%-- 
    Document   : resultado
    Created on : 5/05/2016, 05:39:02 PM
    Author     : hernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int numero =Integer.parseInt(request.getParameter("numero"));
        for(int i=1; i<=10;i++){
        out.println(numero+" * "+i+" = "+(numero*i)+"<br>");
        }    
        %>
        
    </body>
</html>
