/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hernando
 */
public class EjemploMAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "uno");
        mapa.put(2, "dos");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");
        mapa.put(5, "cinco");
        mapa.put(6, "cinco");
        
        System.out.println(mapa.size());
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            System.out.println("key: "+key);
            String value = entry.getValue();
            System.out.println("value: "+value);
            
        }
        
        Map<Perro, Descripcion> mapa2 = new HashMap<>();
        
        Perro p1 = new Perro();
        Perro p2 = p1;
        Perro p3 = new Perro();
        Perro p4 = new Perro();
        Perro p5 = new Perro();
        
        Descripcion dg = new Descripcion();
        
        mapa2.put(p1, dg);
        mapa2.put(p2, dg);
        mapa2.put(p3, dg);
        mapa2.put(p4, dg);
        mapa2.put(p5, dg);
        
        System.out.println(mapa2.size());
        
        
        
    }
    
}
