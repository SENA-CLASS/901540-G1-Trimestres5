/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hernando
 */
@WebServlet(name = "CuartoEjemplo", urlPatterns = {"/CuartoEjemplo"})
public class CuartoEjemplo extends HttpServlet {

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
            out.println("<title>Servlet CuartoEjemplo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CuartoEjemplo at " + request.getContextPath() + "</h1>");
            out.println("<h2>cabeceras del request</h2><br>");
            Enumeration<String> cabeceras = request.getHeaderNames();
           
            while (cabeceras.hasMoreElements()) {
                String ct = cabeceras.nextElement();
                Enumeration<String> cabecerasc = request.getHeaders(ct);
            while (cabecerasc.hasMoreElements()) {
                String ct2 = cabecerasc.nextElement();
                out.println(ct+":--  "+ct2  +"<br>");
            }
                
            }
            
            out.println("<h2>cabeceras del response</h2><br>");
            
            List<String> caresponse = (List<String>)response.getHeaderNames();
            out.println(caresponse.size());
            for (String ca : caresponse) {
                 String caresCuerpo = response.getHeader(ca);
                out.println(ca+": "+caresCuerpo+"<br>");
            }
           
            
            
            out.println("</body>");
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
