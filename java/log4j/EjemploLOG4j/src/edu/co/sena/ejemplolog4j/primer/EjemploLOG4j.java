/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplolog4j.primer;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

/**
 *
 * @author hernando
 */
public class EjemploLOG4j {

     private static final Logger logger = LogManager.getLogger(EjemploLOG4j.class);
    /**
     * @param args es el parametro del metodo principal main
     */
    public static void main(String[] args) {
        // Set up a simple configuration that logs on the console.
        
 
         logger.trace("Entering application.");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            logger.error("Didn't do it.");
            logger.warn("este es log de advertencia");
        }
        logger.trace("Exiting application.");
    }
    
}
