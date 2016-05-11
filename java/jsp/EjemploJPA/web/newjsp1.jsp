<%-- 
    Document   : newjsp1
    Created on : 6/05/2016, 05:26:04 PM
    Author     : hernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        String path = request.getContextPath();
        request.getRequestDispatcher(path+"/NewServlet").include(request, response);
        exception = new ArithmeticException("prueba");
if(request.getAttribute("cuentas")!=null){
}else{

}

        %>
        
       
        
    </body>
</html>
