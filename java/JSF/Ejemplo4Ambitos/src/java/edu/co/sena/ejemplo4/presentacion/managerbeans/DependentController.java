/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo4.presentacion.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author hernando
 */
@Named(value = "dependentController")
@Dependent
public class DependentController {

    /**
     * Creates a new instance of DependentController
     */
    public DependentController() {
    }
    
}
