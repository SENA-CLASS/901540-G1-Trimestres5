package edu.co.sena.ejemplo1.integracion.entities;

import edu.co.sena.ejemplo1.integracion.entities.Cuenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T15:43:20")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> idCargo;
    public static volatile SingularAttribute<Cargo, String> estado;
    public static volatile SingularAttribute<Cargo, String> descripcionCargo;
    public static volatile CollectionAttribute<Cargo, Cuenta> cuentaCollection;

}