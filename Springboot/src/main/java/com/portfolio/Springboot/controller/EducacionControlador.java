package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Educacion;
import com.portfolio.Springboot.service.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionControlador{
    @Autowired
    private EducacionService educSer;
    @GetMapping
    public List<Educacion> getEducacion(){
        return educSer.getEducacion();
    }
    @PostMapping
    public String altaEducacion(@RequestBody Educacion educacion){
        educSer.altaEducacion(educacion);
        return "Estudio cargado...";
    } 
    @DeleteMapping("/del/{id}")
    public String bajaEducacion(@PathVariable Long id){
        educSer.bajaEducacion(id);       
        return "Estudio eliminado...";
    }
    @PutMapping("/edit/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                    @RequestParam ("nombre_estudio") String new_nombre,
                    @RequestParam ("nombre_institucion") String new_institucion,
                    @RequestParam ("año_desde_edu") String nuevo_año_desde,
                    @RequestParam ("año_hasta_edu") String nuevo_año_hasta
            )
    
    
    {
            
            Educacion educ = educSer.findEducacion(id);
            educ.setNombre_estudio(new_nombre);
            educ.setNombre_institucion(new_institucion);
            educ.setAño_desde_edu(nuevo_año_desde);
            educ.setAño_hasta_edu(nuevo_año_hasta);
            
            educSer.altaEducacion(educ);
            return educ;
    

    }
}
