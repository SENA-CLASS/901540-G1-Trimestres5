<%-- 
    Document   : pagina1
    Created on : 11/05/2016, 05:52:04 PM
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
            <jsp:useBean id="perro2" class="edu.co.sena.ejemplo1.presentacion.bean.PerroFormulario" scope="request"/>
            <jsp:setProperty name="perro2" property="nombre" value="perro2"/>
            <jsp:setProperty name="perro2" property="raza" value="sdfsadf"/>
            <jsp:setProperty name="perro2" property="tamano" value="12345"/>
            <jsp:forward page="pagina2.jsp">
                <jsp:param name="eje" value="aka"/>
            </jsp:forward>
            
    </body>
</html>
