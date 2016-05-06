<%-- 
    Document   : pagina1
    Created on : 6/05/2016, 03:26:24 PM
    Author     : hernando
--%>

<%@page import="java.util.List"%>
<%! private String nombre = "Hernando";
    private String apellido = "Moreno";
    private List<Object> listado;%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

        %>

        <%!
            public String getNombre() {
                return this.nombre;
            }
        %>
        
        <%=this.apellido = "adsfasdf"%>
        <%=this.nombre%>
        <%=this.apellido%>




        <h1>Hello World!</h1>
    </body>
</html>
