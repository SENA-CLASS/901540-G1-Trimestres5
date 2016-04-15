package com.example.logging;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.db.jpa.BasicLogEventEntity;


@Entity
@Table(name="application_log", schema="log")
public class JpaLogEntity extends BasicLogEventEntity {
    private static final long serialVersionUID = 1L;
    private long id = 0L;
 
    
   
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return this.id;
    }
    
 
    public void setId(long id) {
        this.id = id;
    }
 
    // If you want to override the mapping of any properties mapped in BasicLogEventEntity,
    // just override the getters and re-specify the annotations.
}