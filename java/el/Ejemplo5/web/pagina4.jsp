<%-- 
    Document   : pagina4
    Created on : 19/05/2016, 05:47:18 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <c:set var="a" value="uno" scope="page" />
        <c:set var="b" value="dos" scope="page"/>
        
        <jsp:useBean id="c" class="java.lang.String" scope="page"/>
        <jsp:useBean id="d" class="java.lang.String" scope="page"/>
        
        ${pageScope.a=5;pageScope.a}
        ${pageScope.b=5;pageScope.b}
        ${pageScope.c=5;pageScope.c}
        ${pageScope.d=5;pageScope.d}
        
    </body>
</html>
