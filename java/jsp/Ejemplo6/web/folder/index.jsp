<%-- 
    Document   : index
    Created on : 10/05/2016, 03:21:45 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="/error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%--   <script type="text/javascript" src="resources/js/mijavascript.js"></script> --%>
    </head>
    <body>
        <form action="index.jsp" method="POST" onsubmit="return validacion()">
            <input type="text" value="<%
                if(request.getParameter("operacion")==null){
                out.println("");
                }else {
                    double numero1= Double.parseDouble(request.getParameter("numero1"));
                    double numero2= Double.parseDouble(request.getParameter("numero2"));
                    String op =request.getParameter("operacion");
                    Double resultado = null;
                    if(op.equals("suma")){
                        
                            resultado = numero1+numero2;
                            request.setAttribute("resutaldo", resultado);
                            out.print(request.getAttribute("resutaldo"));
                    //        request.getRequestDispatcher("index.jsp=resultado="+resultado);
                            
                    }
                    
                }
                
            %>" name="numero1" required id="num1"  />
            <input type="text" id="num2" name="numero2" required/>
            <input type="submit" value="suma" name="operacion" />
            <input type="submit" value="resta" name="operacion"/>
            <input type="submit" value="multi" name="operacion"/>
            <input type="submit" value="divi" name="operacion"/>
            <%out.println(request.getParameter("operacion"));%> 
        </form>
    </body>
</html>
