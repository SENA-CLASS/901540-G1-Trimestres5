/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplologueofiltro.negocio.listener;

import edu.co.sena.ejemplologueofiltro.integracion.entities.Usuario;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Web application lifecycle listener.
 *
 * @author hernando
 */
public class AttributeSessionServletListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        
        System.out.println("se crea un aributo en la session");
        Usuario usu = (Usuario) event.getSession().getAttribute("usuario");
        if (usu != null) {
            System.out.println("se crea el usuario" + usu.getCuenta().getPrimerNombre());
        }else{
            System.out.println("usuario no esta logueado");
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("se elimina un atribto de session");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("se remplaza un atributo de session");
    }
}
