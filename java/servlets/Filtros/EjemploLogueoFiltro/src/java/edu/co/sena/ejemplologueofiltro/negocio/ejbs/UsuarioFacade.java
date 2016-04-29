/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplologueofiltro.negocio.ejbs;

import edu.co.sena.ejemplologueofiltro.integracion.entities.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hernando
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "EjemploLogueoFiltroPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario findByPk(String tipoDocumento, String numeroDocumento) {
        try {
            Query query = getEntityManager().createNamedQuery("Usuario.findByPK");
            query.setParameter("cuentaTipoDocumentotipodocumento", tipoDocumento);
            query.setParameter("cuentanumeroDocumento", numeroDocumento);
            List<Usuario> ut = (List<Usuario>)query.getResultList();
            if (ut.isEmpty()) {
                return null;
            }else{
                return ut.get(0);
            }
        } catch (Exception e) {
            System.out.println("error que va para el log");
            return null;
        }

    }
    
}
