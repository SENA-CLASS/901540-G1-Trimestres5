<%-- 
    Document   : cliente
    Created on : 5/05/2016, 04:49:49 PM
    Author     : hernando
--%>

<%@page import="edu.co.sena.ejemplo2.integracion.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true" errorPage="/error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <%
            session= request.getSession(false);
            if (session != null) {
                if(session.getAttribute("usuario")!=null){
                Usuario usuario = (Usuario) session.getAttribute("usuario");
                out.println("esta logueado el usuario "
                        + usuario.getCuenta().getPrimerNombre() + " "
                        + usuario.getCuenta().getSegundoNombre() + " "
                        + usuario.getCuenta().getPrimerApellido() + " "
                        + usuario.getCuenta().getSegundoApellido() + " "
                        + usuario.getRol() + " "
                );
                }else{
                response.sendRedirect(request.getContextPath()+"/error.jsp");
                
                }
            }
        %>
    </body>
</html>
