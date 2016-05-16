/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2.modelo;

/**
 *
 * @author hernando
 */
public class Lugar {
    private Coordenada coordenada;
    private String nombre;

    public Lugar(Coordenada coordenada, String nombre) {
        this.coordenada = coordenada;
        this.nombre = nombre;
    }
    
    

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
