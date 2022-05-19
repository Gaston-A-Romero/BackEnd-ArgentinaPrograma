
package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Proyecto;
import com.portfolio.Springboot.service.ProyectoService;
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
@RequestMapping("/proyecto")
public class ProyectoControlador {
    @Autowired
    private ProyectoService proSer;
    @GetMapping
    public List<Proyecto> getProyecto(){
        return proSer.getProyecto();
    }
    @PostMapping
    public String altaProyecto(@RequestBody Proyecto project){
        proSer.altaProyecto(project);
        return "Proyecto agregado...";
    }
    @DeleteMapping("/del/{id}")
    public String bajaProyecto(@PathVariable Long id){
        proSer.bajaProyecto(id);
        return "Proyecto eliminado...";
    }
    @PutMapping("/edit/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
            @RequestParam ("nombrePro") String new_nombre ,
            @RequestParam ("descripcionPro") String new_desc ,
            @RequestParam ("url_proyecto") String new_url ,
            @RequestParam ("url_repo") String new_repo){
        Proyecto project = proSer.findProyecto(id);
        project.setNombrePro(new_nombre);
        project.setDescripcionPro(new_desc);
        project.setUrl_proyecto(new_url);
        project.setUrl_repo(new_repo);
        
        proSer.altaProyecto(project);
        return project;
        
    }
    
    
}
