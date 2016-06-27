package edu.co.sena.ejemplo1.integracion.entities;

import edu.co.sena.ejemplo1.integracion.entities.Cuenta;
import edu.co.sena.ejemplo1.integracion.entities.Equipo;
import edu.co.sena.ejemplo1.integracion.entities.PropietarioPK;
import edu.co.sena.ejemplo1.integracion.entities.Registro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T15:43:20")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, PropietarioPK> propietarioPK;
    public static volatile CollectionAttribute<Propietario, Registro> registroCollection;
    public static volatile SingularAttribute<Propietario, Equipo> equipo;
    public static volatile SingularAttribute<Propietario, Cuenta> cuenta;

}