<%-- 
    Document   : index
    Created on : 23/05/2016, 02:33:34 PM
    Author     : hernando
--%>

<%@taglib prefix="c" uri="" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach begin="1" end="10" var="a">
            <c:out value="a"/>
            
        </c:forEach>
        
        ${num = 10; "numero: "+= num}<br/>
        ${num3 = 10; "numero3: "+=num3}<br/>
        ${num4 = (num+num3); "numero 4 : "+=num4}<br/>
        ${num2 =Integer.parseInt(num)}<br/>
        ${num2.toString()+="esto es un String"}<br/>
        ${texto = "hola"; texto.charAt(3)}<br/>
        
        
        
        
    </body>
</html>
