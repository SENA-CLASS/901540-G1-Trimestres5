<%-- 
    Document   : pagina2
    Created on : 12/05/2016, 04:36:26 PM
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
                <td><b>Relational Operator</b></td>
                <td><b>Boolean Result</b></td>
            </tr>
            <tr>
                <td>${'${'}10 &lt; 20}</td>
                <td>${10 < 20}</td>
            </tr>
            <tr>
                <td>${'${'}10 &gt; 20}</td>
                <td>${10 > 20}</td>
            </tr>
            <tr>
                <td>${'${'}10 &gt;= 10}</td>
                <td>${10 >= 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 &lt;= 10}</td>
                <td>${10 <= 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 == 10}</td>
                <td>${10 == 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 != 20}</td>
                <td>${10 != 20}</td>
            </tr>
            <tr>
            <tr>
                <td>${'${'}10 lt 20}</td>
                <td>${10 lt 20}</td>
            </tr>
            <tr>
                <td>${'${'}10 gt 20}</td>
                <td>${10 gt 20}</td>
            </tr>
            <tr>
                <td>${'${'}10 le 10}</td>
                <td>${10 le 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 ge 10}</td>
                <td>${10 ge 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 eq 10}</td>
                <td>${10 eq 10}</td>
            </tr>
            <tr>
                <td>${'${'}10 ne 20}</td>
                <td>${10 ne 20}</td >
            </tr>
        </table>
    </body>
</html>
