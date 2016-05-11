/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.negocio.ejbs;

import edu.co.sena.ejemplo1.integracion.entites.Cargo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hernando
 */
@Stateless
public class CargoFacade extends AbstractFacade<Cargo> {

    @PersistenceContext(unitName = "Ejemplo1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CargoFacade() {
        super(Cargo.class);
    }
    
    public Cargo findByIdCargo(String idCargo){
        Query query = getEntityManager().createNamedQuery("Cargo.findByIdCargo");
        query.setParameter("idCargo", idCargo);
        return (Cargo)query.getSingleResult();
    }
}
