/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import edu.co.sena.ejemplo.integracion.entidades.Perro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hernando
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Perro p1 = new Perro();
        p1.setId("1");
        p1.setNombre("pili");
        p1.setRaza("Dobermang");
        
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
    }
    
}
