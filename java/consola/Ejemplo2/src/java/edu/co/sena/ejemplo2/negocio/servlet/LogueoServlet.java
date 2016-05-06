/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2.negocio.servlet;


import edu.co.sena.ejemplo2.integracion.entities.Usuario;
import edu.co.sena.ejemplo2.negocio.ejbs.UsuarioFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hernando
 */
@WebServlet(name = "LogueoServlet", urlPatterns = {"/LogueoServlet"})
public class LogueoServlet extends HttpServlet {

    @Inject
    private UsuarioFacade ejbUsuario;

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

        try {
            Usuario usuario = ejbUsuario.findByPk(request.getParameter("tipoDocumento"),
                    request.getParameter("numeroDocumento"));
            if (usuario != null) {
                if (request.getParameter("password").equals(usuario.getPass())) {
                    
                  
                    
                    
                    HttpSession session;
                    
                    if(request.getSession()!=null){
                        request.getSession(false).invalidate();
                    }
                    
                    switch (usuario.getRol()) {
                        case "admin":
                            session = request.getSession();
                            session.setAttribute("usuario", usuario);
                            response.sendRedirect("admin/administrador.jsp");
                            //request.getRequestDispatcher("admin/administrador.jsp").forward(request, response);
                            break;
                        case "cliente":
                            session = request.getSession();
                            session.setAttribute("usuario", usuario);
                            response.sendRedirect("cliente/cliente.jsp");
                            break;
                        default:
                            response.sendRedirect("logueo.jsp");
                            break;
                    }

                } else {
                    response.sendRedirect("logueo.jsp");
                }
            } else {
                response.sendRedirect("logueo.jsp");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
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
