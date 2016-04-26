/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo6.negocio.servlets;

import edu.co.sena.ejemplo6.integracion.entities.Usuario;
import edu.co.sena.ejemplo6.integracion.entities.UsuarioLogueado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hernando
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

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
            HttpSession session = request.getSession(false);
            if (session != null) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Servlet2</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Servlet2 at " + request.getContextPath() + "</h1>");
                

                //UsuarioLogueado usuario = (Usuario)session.getAttribute("usuario");
                //out.println("<h1>el usuario logueado es"+usuario.getCuenta().getPrimerNombre() + "</h1>");
                
                //UsuarioLogueado usuario = (Usuario)request.getAttribute("usuario");
                //out.println("<h1>el usuario logueado es"+usuario.getCuenta().getPrimerNombre() + "</h1>");
                ServletContext application=getServletContext();
                UsuarioLogueado usuario = (Usuario)application.getAttribute("usuario");
                out.println("<h1>el usuario logueado es"+usuario.getCuenta().getPrimerNombre() + "</h1>");
                
                
                out.println("<a href=\"Servlet3\">cerrar</a>");
                
                
                out.println("</body>");
                out.println("</html>");
            }else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Servlet2</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Usted no esta logueado</h1>");
                out.println("</body>");
                out.println("</html>");
            
            }

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
