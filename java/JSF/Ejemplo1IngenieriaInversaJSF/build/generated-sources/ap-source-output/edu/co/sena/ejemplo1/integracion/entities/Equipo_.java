package edu.co.sena.ejemplo1.integracion.entities;

import edu.co.sena.ejemplo1.integracion.entities.Propietario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T15:43:20")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, String> descripcion;
    public static volatile SingularAttribute<Equipo, String> marca;
    public static volatile SingularAttribute<Equipo, String> estado;
    public static volatile SingularAttribute<Equipo, String> serial;
    public static volatile CollectionAttribute<Equipo, Propietario> propietarioCollection;

}