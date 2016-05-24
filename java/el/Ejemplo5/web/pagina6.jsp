<%-- 
    Document   : pagina6
    Created on : 20/05/2016, 03:06:53 PM
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
        este el ejemplo de la Assignment Operator y semicolon
        <h1>${numero1 = 1.9; numero5= 150; "numero1 ="+= numero1 +="; numero5="+=numero5}</h1>
        <h1>${numero2 = 3.7; ""}</h1>
        <h1>${numero3 = numero1}</h1>
        <h1>${resultado =numero1*numero2; numero1 +=" * "+= numero2 += " = "+=resultado}</h1>
        <h1>${a = 5}</h1>
        <h1>${b = "hola"}</h1>
        <h1>${c = a}</h1>
        <h1>${(a mod 2)== 0 ? "par" : "impar"}</h1>
    </body>
</html>
