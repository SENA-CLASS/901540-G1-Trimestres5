<%-- 
    Document   : newjsf1
    Created on : 25/05/2016, 03:04:13 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="Hello World!"/></h1>
            <jsp:include page="servlet"/>
            
            <jsp:useBean beanName="a" id="listaPerros"  scope="request" class="java.util.List">
                
            
        </body>
    </html>
</f:view>
