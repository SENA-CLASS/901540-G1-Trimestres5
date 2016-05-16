/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.presentacion.bean;

/**
 *
 * @author hernando
 */
public class PerroFormulario {
    private String nombre;
    private String raza;
    private String tamano;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "PerroFormulario{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + '}';
    }
    
    
    
    
}
