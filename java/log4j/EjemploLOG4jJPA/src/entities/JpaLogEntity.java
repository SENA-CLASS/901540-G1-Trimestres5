/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.db.jpa.BasicLogEventEntity;

/**
 *
 * @author hernando
 */
@Entity
public class JpaLogEntity  implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    
    
    @Id
    private long id = 0L;
 
   
 
    
    
    
    
    public long getId() {
        return this.id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    
}
