/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplolog4jjpa;

import com.example.logging.JpaLogEntity;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.SimpleMessage;

/**
 *
 * @author Enrique
 */
public class NewMain {

    private static final Logger logger = LogManager.getLogger(NewMain.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("loggingPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        JpaLogEntity logEntity =new JpaLogEntity();
        logEntity.setMessage(new SimpleMessage("adsfasdfsdfasdfasd"));
        
        
        em.persist(logEntity);
       
        em.getTransaction().commit();
        logger.error("mensaje de error");
        logger.warn("mensaje de alerta");
    }
    
}
