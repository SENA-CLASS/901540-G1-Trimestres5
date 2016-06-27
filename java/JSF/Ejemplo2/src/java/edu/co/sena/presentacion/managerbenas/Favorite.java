/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.presentacion.managerbenas;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hernando
 */
@Named(value = "favorite")
@RequestScoped
public class Favorite {

    private String food = "adfsadf";
    private String beverage = "adsfasd";
    private String sport;
    
    /**
     * Creates a new instance of Favorite
     */
    public Favorite() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    
    
}
