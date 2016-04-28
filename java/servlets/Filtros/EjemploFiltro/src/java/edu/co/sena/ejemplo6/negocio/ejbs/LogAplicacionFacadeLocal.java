/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo6.negocio.ejbs;

import edu.co.sena.ejemplo6.integracion.entities.LogAplicacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hernando
 */
@Local
public interface LogAplicacionFacadeLocal {

    void create(LogAplicacion logAplicacion);

    void edit(LogAplicacion logAplicacion);

    void remove(LogAplicacion logAplicacion);

    LogAplicacion find(Object id);

    List<LogAplicacion> findAll();

    List<LogAplicacion> findRange(int[] range);

    int count();
    
}
