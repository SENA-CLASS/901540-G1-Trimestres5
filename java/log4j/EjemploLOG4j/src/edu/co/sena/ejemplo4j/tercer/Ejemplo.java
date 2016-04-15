/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo4j.tercer;

import edu.co.sena.ejemplolog4j.primer.Bar;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author hernando
 */
public class Ejemplo {

      static final Logger logger = LogManager.getLogger(Ejemplo.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));
        
        double c = a/b;
            
        JOptionPane.showMessageDialog(null, c);
        logger.info("se hizo bien la division");
        
            
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        
        
    }
    
}
