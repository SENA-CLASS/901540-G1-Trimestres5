<%-- 
    Document   : newjsp
    Created on : 11/05/2016, 02:51:10 PM
    Author     : hernando
--%>

<%@page import="edu.co.sena.ejemplo1.presentacion.bean.PerroFormulario"%>
<%@page import="edu.co.sena.ejemplo1.presentacion.bean.CheckOutFormBean"%>
<%@page import="java.util.List"%>
<%@page import="edu.co.sena.ejemplo1.integracion.entites.Cargo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!List<Cargo> lista;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="connection" class="edu.co.sena.ejemplo1.presentacion.bean.CheckOutFormBean" />
        
        
        <jsp:useBean id="perro2" class="edu.co.sena.ejemplo1.presentacion.bean.PerroFormulario" scope="request"/>
            <jsp:setProperty name="perro2" property="nombre" value="perro2"/>
            <jsp:setProperty name="perro2" property="raza" value="sdfsadf"/>
            <jsp:setProperty name="perro2" property="tamano" value="12345"/>
        
        
        <%
            CheckOutFormBean objeto = new CheckOutFormBean();
            PerroFormulario fp = new PerroFormulario();
            fp.setNombre("pili");
            fp.setRaza("Dobermang");
            fp.setTamano("grande");
        %>
        
        <%=fp.toString()%>
        <jsp:getProperty name="perro2" property="nombre"/>
        <jsp:getProperty name="perro2" property="raza"/>
        <jsp:getProperty name="perro2" property="tamano"/>
    </head>
    <body>


        ${pageContext.request.getParameter("campo1")}
        <%=request.getParameter("campo1")%>
        ${param.campo1}
        ${paramValues.campo1}
        
        <jsp:forward page="pagina.jsp"/>
    

</body>
</html>
