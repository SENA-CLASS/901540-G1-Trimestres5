/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo6.negocio.servlets.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hernando
 */
@WebFilter(filterName = "FiltroEstadisticas2", urlPatterns = {"*.html"})
public class FiltroEstadisticas2 implements Filter {

    
    
    public FiltroEstadisticas2() {
    }
    
     /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {
       
        System.out.println("estoy en el init");
    }


    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain)
            throws IOException, ServletException {

       
        System.out.println("estoy en el doFilter");
        
        try {
            HttpServletResponse response = (HttpServletResponse) res;
            HttpServletRequest request = (HttpServletRequest) req;
            ServletContext contexto = request.getServletContext();

            HashMap<String, Integer> urls;
            if (contexto.getAttribute("estadistica") == null) {
                
                urls = new HashMap<>();

                urls.put(request.getRequestURL().toString(), 1);
                contexto.setAttribute("estadistica", urls);
            } else {

                
                urls = (HashMap<String, Integer>) contexto.getAttribute("estadistica");

                if (urls.get(request.getRequestURL().toString()) == null) {

                    urls.put(request.getRequestURL().toString(), 1);
                } else {
                    urls.put(request.getRequestURL().toString(), urls.get(request.getRequestURL().toString()) + 1);
                }
            }

            chain.doFilter(request, response);
        } catch (Throwable t) {
          
           
        }

      
    }

   
    /**
     * Destroy method for this filter
     */
    public void destroy() {
        System.out.println("estoy en el destroy");
    }

   

   

}
