/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo3.presentacion.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hernando
 */
@Named(value = "holaMundo")
@RequestScoped
public class HolaMundo {
    
    private String mensaje = "Hola Mundo";

    /**
     * Creates a new instance of HolaMundo
     */
    public HolaMundo() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
