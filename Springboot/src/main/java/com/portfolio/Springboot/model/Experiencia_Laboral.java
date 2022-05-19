package com.portfolio.Springboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exp_laboral")
public class Experiencia_Laboral implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id_exp;
    private String nombre_puesto;
    private String nombre_empresa;
    private Integer año_desde_exp;
    private Integer año_hasta_exp;
    private String descripcion_exp;

  

    
    
    public String getNombre_puesto() {
        return nombre_puesto;
    }

    public void setNombre_puesto(String nombre_puesto) {
        this.nombre_puesto = nombre_puesto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public Long getId_exp() {
        return id_exp;
    }

    public void setId_exp(Long id_exp) {
        this.id_exp = id_exp;
    }

    public Integer getAño_desde_exp() {
        return año_desde_exp;
    }

    public void setAño_desde_exp(Integer año_desde_exp) {
        this.año_desde_exp = año_desde_exp;
    }

    public Integer getAño_hasta_exp() {
        return año_hasta_exp;
    }

    public void setAño_hasta_exp(Integer año_hasta_exp) {
        this.año_hasta_exp = año_hasta_exp;
    }

    public String getDescripcion_exp() {
        return descripcion_exp;
    }

    public void setDescripcion_exp(String descripcion_exp) {
        this.descripcion_exp = descripcion_exp;
    }

   
    
    
    
    
}
