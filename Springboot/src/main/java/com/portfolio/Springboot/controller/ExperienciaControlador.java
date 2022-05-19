/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Experiencia_Laboral;
import com.portfolio.Springboot.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exp")
public class ExperienciaControlador {
    
    @Autowired
    private ExperienciaService expSer;
    @GetMapping
    public List<Experiencia_Laboral> getExp(){
        return expSer.getExp();
    }
    @PostMapping
    public String altaExp(@RequestBody Experiencia_Laboral exp){
        expSer.altaExp(exp);
        return "Experiencia Laboral cargada...";
    }
    @DeleteMapping("/del/{id}")
    public String bajaExp(@PathVariable Long id){
        expSer.bajaExp(id);
        return "Experiencia laboral eliminada...";
    }    
    @PutMapping("/edit/{id}")
    public Experiencia_Laboral editExp(@PathVariable Long id,
            @RequestParam ("nombre_puesto") String new_nombre_p ,
            @RequestParam ("nombre_empresa") String new_nombre_e,
            @RequestParam ("año_desde_exp") Integer new_año_d ,
            @RequestParam ("año_hasta_exp") Integer new_año_h ,
            @RequestParam ("descripcion_exp") String new_descripcion){
        Experiencia_Laboral exp = expSer.findExp(id);
        exp.setNombre_puesto(new_nombre_p);
        exp.setNombre_empresa(new_nombre_e);
        exp.setAño_desde_exp(new_año_d);
        exp.setAño_hasta_exp(new_año_h);
        exp.setDescripcion_exp(new_descripcion);
        
        expSer.altaExp(exp);
        return exp;
    
    
    
    }
    
}
