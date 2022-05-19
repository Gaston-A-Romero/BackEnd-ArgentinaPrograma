
package com.portfolio.Springboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skill implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO ) 
    private Long idSk;
    private String nombreSk;

   
    
    
    public Long getIdSk() {
        return idSk;
    }

    public void setIdSk(Long idSk) {
        this.idSk = idSk;
    }

    public String getNombreSk() {
        return nombreSk;
    }

    public void setNombreSk(String nombreSk) {
        this.nombreSk = nombreSk;
    }

    
    
    
    
}
