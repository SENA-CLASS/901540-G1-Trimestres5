/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo6.integracion.entities;

/**
 *
 * @author hernando
 */
public interface UsuarioLogueado {
    public UsuarioPK getUsuarioPK();
    
    public String getRol();
    
    public String getEstado();

    public Cuenta getCuenta();

   
}
