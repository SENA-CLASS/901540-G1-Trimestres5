<%-- 
    Document   : respuesta
    Created on : 6/05/2016, 03:47:18 PM
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
        <%=request.getParameter("campo1")%>

        <%
            out.println(request.getParameter("campo1"));
        %><br>
        <table border ="2">

            <%for (int i = 1; i <= 10; i++) {%>
            <tr><td>
                    1 * <%=i%> = <%=(i * 1)%><br>
            </td></tr>
            <%}%>
        </table><br>
        <%
            out.println(" <table border =\"2\">");
            for (int i = 1; i <= 10; i++) {
                
            out.println("<tr><td>");
                out.print("1 * "+i+" = "+(1+i)+"");
            out.println("</td></tr>");
            }
            out.println(" </table>");
        %>
    </body>
</html>
