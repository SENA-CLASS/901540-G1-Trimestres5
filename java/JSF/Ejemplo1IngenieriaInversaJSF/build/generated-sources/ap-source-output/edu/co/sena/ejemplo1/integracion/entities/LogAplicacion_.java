package edu.co.sena.ejemplo1.integracion.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T15:43:20")
@StaticMetamodel(LogAplicacion.class)
public class LogAplicacion_ { 

    public static volatile SingularAttribute<LogAplicacion, Long> idlogAplicacion;
    public static volatile SingularAttribute<LogAplicacion, String> log;
    public static volatile SingularAttribute<LogAplicacion, Date> hora;
    public static volatile SingularAttribute<LogAplicacion, String> mensaje;
    public static volatile SingularAttribute<LogAplicacion, String> nivel;

}