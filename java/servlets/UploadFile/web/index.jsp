<%-- 
    Document   : newjsp
    Created on : 3/05/2016, 03:48:36 PM
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
        <center>
    <h1>File Upload</h1>
    <form method="post" action="UploadServlet"
        enctype="multipart/form-data">
        Select file to upload: <input type="file" name="file" size="60" /><br />
        <br /> <input type="submit" value="Upload" />
    </form>
    <%
        if(request.getAttribute("message")!=null){
            String mensaje = (String)request.getAttribute("message");
        out.println(mensaje);
        }
    
    %>
</center>
    </body>
</html>
