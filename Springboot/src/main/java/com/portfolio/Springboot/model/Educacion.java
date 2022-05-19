
package com.portfolio.Springboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "educacion")
public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id_edu;
    private String nombre_estudio;
    private String nombre_institucion;
    private String año_desde_edu;
    private String año_hasta_edu;

    
    
    
    public Long getId_edu() {
        return id_edu;
    }

    public void setId_edu(Long id_edu) {
        this.id_edu = id_edu;
    }

   

    public String getNombre_estudio() {
        return nombre_estudio;
    }

    public void setNombre_estudio(String nombre_estudio) {
        this.nombre_estudio = nombre_estudio;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getAño_desde_edu() {
        return año_desde_edu;
    }

    public void setAño_desde_edu(String año_desde_edu) {
        this.año_desde_edu = año_desde_edu;
    }

    public String getAño_hasta_edu() {
        return año_hasta_edu;
    }

    public void setAño_hasta_edu(String año_hasta_edu) {
        this.año_hasta_edu = año_hasta_edu;
    }

    

   

   

    
    
    
            
    
}
