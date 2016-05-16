<%-- 
    Document   : index
    Created on : 12/05/2016, 04:20:50 PM
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
        <table border="1">
            <tr>
                <td><b>Arithmetic Operator</b></td>
                <td><b>Boolean Result</b></td>
            </tr>
            <tr>
                <td>${'${'}2 + 2 }</td>
                <td>${2 + 2}</td>
            </tr>
            <tr>
                <td>${'${'}2 - 2 }</td>
                <td>${2 - 2}</td>
            </tr>
            <tr>
                <td>${'${'}2 * 2 }</td>
                <td>${2 * 2}</td>
            </tr>
            <tr>
                <td>${'${'}2 / 2 }</td>
                <td>${2 / 2}</td>
            </tr>
            <tr>
                <td>${'${'}2 mod 2 }</td>
                <td>${2 mod 2}</td>
            </tr>
            <tr>
                <td>${'${'}2 div 2 }</td>
                <td>${2 div 2}</td>
            </tr>
        </table>
    </body>
</html>
