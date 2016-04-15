/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo4j.segundo;

import edu.co.sena.ejemplolog4j.primer.EjemploLOG4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 *
 * @author hernando
 */
public class NewMain {
    
    static Logger log = LogManager.getLogger(NewMain.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
         
         
        
         log.fatal("esto es un error fatal");
         log.error("esto es un error");
         log.warn("esto es una alvertencia"); 
         log.info("esto es un mensaje de información");
         log.debug("esto es un mensaje de debug");
         log.trace("esto es un mensaje de razabilidad");
         
        
    }
    
}
