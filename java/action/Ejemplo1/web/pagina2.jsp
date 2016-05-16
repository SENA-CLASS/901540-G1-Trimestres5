<%-- 
    Document   : pagina2
    Created on : 11/05/2016, 05:50:24 PM
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
        <h1>pagina2</h1>
        
        <jsp:useBean id="perro2" class="edu.co.sena.ejemplo1.presentacion.bean.PerroFormulario" scope="request"/>
         <jsp:getProperty name="perro2" property="nombre"/>
        <jsp:getProperty name="perro2" property="raza"/>
        <jsp:getProperty name="perro2" property="tamano"/>
        ${param.eje}
    </body>
</html>
