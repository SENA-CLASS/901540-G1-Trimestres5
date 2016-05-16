<%-- 
    Document   : pagina4
    Created on : 12/05/2016, 03:00:35 PM
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
        <jsp:include page="pagina5.jsp" >
            <jsp:param name="apellido" value="moreno"/>
        </jsp:include>
    </body>
</html>
