/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2.integracion.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hernando
 */
@Entity
@Table(name = "log_aplicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogAplicacion.findAll", query = "SELECT l FROM LogAplicacion l"),
    @NamedQuery(name = "LogAplicacion.findByIdlogAplicacion", query = "SELECT l FROM LogAplicacion l WHERE l.idlogAplicacion = :idlogAplicacion"),
    @NamedQuery(name = "LogAplicacion.findByNivel", query = "SELECT l FROM LogAplicacion l WHERE l.nivel = :nivel"),
    @NamedQuery(name = "LogAplicacion.findByMensaje", query = "SELECT l FROM LogAplicacion l WHERE l.mensaje = :mensaje"),
    @NamedQuery(name = "LogAplicacion.findByLog", query = "SELECT l FROM LogAplicacion l WHERE l.log = :log"),
    @NamedQuery(name = "LogAplicacion.findByHora", query = "SELECT l FROM LogAplicacion l WHERE l.hora = :hora")})
public class LogAplicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlog_aplicacion")
    private Long idlogAplicacion;
    @Size(max = 10)
    @Column(name = "nivel")
    private String nivel;
    @Size(max = 1000)
    @Column(name = "mensaje")
    private String mensaje;
    @Size(max = 1000)
    @Column(name = "log")
    private String log;
    @Column(name = "hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;

    public LogAplicacion() {
    }

    public LogAplicacion(Long idlogAplicacion) {
        this.idlogAplicacion = idlogAplicacion;
    }

    public Long getIdlogAplicacion() {
        return idlogAplicacion;
    }

    public void setIdlogAplicacion(Long idlogAplicacion) {
        this.idlogAplicacion = idlogAplicacion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlogAplicacion != null ? idlogAplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogAplicacion)) {
            return false;
        }
        LogAplicacion other = (LogAplicacion) object;
        if ((this.idlogAplicacion == null && other.idlogAplicacion != null) || (this.idlogAplicacion != null && !this.idlogAplicacion.equals(other.idlogAplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.sena.ejemplo2.integracion.entities.LogAplicacion[ idlogAplicacion=" + idlogAplicacion + " ]";
    }
    
}
