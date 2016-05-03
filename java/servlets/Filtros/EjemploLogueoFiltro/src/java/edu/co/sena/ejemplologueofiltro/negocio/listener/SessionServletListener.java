/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplologueofiltro.negocio.listener;

import edu.co.sena.ejemplologueofiltro.integracion.entities.Usuario;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author hernando
 */
public class SessionServletListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {

        System.out.println("se crea el sesion" + se.getSession());
        
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("se elimina la session");
    }
}
