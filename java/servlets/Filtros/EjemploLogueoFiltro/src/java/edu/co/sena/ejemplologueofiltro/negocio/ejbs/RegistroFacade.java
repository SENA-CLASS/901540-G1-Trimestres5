/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplologueofiltro.negocio.ejbs;

import edu.co.sena.ejemplologueofiltro.integracion.entities.Registro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hernando
 */
@Stateless
public class RegistroFacade extends AbstractFacade<Registro> {

    @PersistenceContext(unitName = "EjemploLogueoFiltroPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroFacade() {
        super(Registro.class);
    }
    
}