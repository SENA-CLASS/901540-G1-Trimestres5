/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2.negocio.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hernando
 */
@WebServlet(name = "Pagina2Servlet", urlPatterns = {"/Pagina2Servlet"})
public class Pagina2Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pagina2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            request.getRequestDispatcher("Servlet2").include(request, response);
            Map<String, String> libros = (Map<String, String>)request.getAttribute("libros");
            out.println("<h2>aca imprimo los libros usando el []<br/></h2>");
            out.println(libros.get("java")+"<br/>");
            out.println(libros.get(".net")+"<br/>");
            out.println(libros.get("Python")+"<br/>");
            out.println(libros.get("go")+"<br/>");
            out.println("<h2>aca imprimo los libros usando el operador punto (.)<br/></h2>");
            out.println(libros.get("java")+"<br/>");
            out.println(libros.get(".net")+"<br/>");
            out.println(libros.get("Python")+"<br/>");
            out.println(libros.get("go")+"<br/>");
            out.println("<h2>aca imprimo los libros usando el action c:forEach<br/></h2>");
            
            for (Map.Entry<String, String> entry : libros.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                out.println(key+":"+value+"<br/>");
            }
            out.println("<h2>aca imprimo los libros usando el action c:forEach<br/></h2>");
            for (Map.Entry<String, String> entry : libros.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                out.println("Key: "+key+"<br/>");
                out.println("Value: "+value+"<br/>");
            }
       out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
