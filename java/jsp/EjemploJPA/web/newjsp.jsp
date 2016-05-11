<%-- 
    Document   : newjsp
    Created on : 6/05/2016, 04:54:12 PM
    Author     : hernando
--%>
<%@page import="edu.co.sena.integracion.enities.Cuenta"%>
<%@page import="java.util.List"%>
<%@page import="javax.ejb.EJB"%>
<%@page import="edu.co.sena.negocio.ejbs.CuentaFacade"%>
<%!@EJB
   private CuentaFacade ebjCuenta;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        List<Cuenta> cuentas = ebjCuenta.findAll();
        %>
        <%=cuentas.size()%>
    </body>
</html>
