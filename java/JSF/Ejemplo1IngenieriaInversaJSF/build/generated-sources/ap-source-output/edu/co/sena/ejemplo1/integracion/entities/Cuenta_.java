package edu.co.sena.ejemplo1.integracion.entities;

import edu.co.sena.ejemplo1.integracion.entities.Cargo;
import edu.co.sena.ejemplo1.integracion.entities.CuentaPK;
import edu.co.sena.ejemplo1.integracion.entities.Propietario;
import edu.co.sena.ejemplo1.integracion.entities.Registro;
import edu.co.sena.ejemplo1.integracion.entities.TipoDocumento;
import edu.co.sena.ejemplo1.integracion.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T15:43:20")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, String> segundoNombre;
    public static volatile SingularAttribute<Cuenta, String> estado;
    public static volatile SingularAttribute<Cuenta, String> primerNombre;
    public static volatile SingularAttribute<Cuenta, String> primerApellido;
    public static volatile CollectionAttribute<Cuenta, Registro> registroCollection;
    public static volatile SingularAttribute<Cuenta, CuentaPK> cuentaPK;
    public static volatile SingularAttribute<Cuenta, String> segundoApellido;
    public static volatile SingularAttribute<Cuenta, Cargo> cargoidCargo;
    public static volatile CollectionAttribute<Cuenta, Propietario> propietarioCollection;
    public static volatile SingularAttribute<Cuenta, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Cuenta, byte[]> foto;
    public static volatile SingularAttribute<Cuenta, Usuario> usuario;
    public static volatile SingularAttribute<Cuenta, Date> fechaTerminacion;

}