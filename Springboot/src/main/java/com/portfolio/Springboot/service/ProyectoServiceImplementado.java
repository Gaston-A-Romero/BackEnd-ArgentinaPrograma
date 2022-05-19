
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Proyecto;
import com.portfolio.Springboot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImplementado implements ProyectoService{

    @Autowired
    private ProyectoRepository proyectoRep;
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyectos = proyectoRep.findAll();
        return listaProyectos;
    }

    @Override
    public void altaProyecto(Proyecto project) {
        proyectoRep.save(project);
    }

    @Override
    public void bajaProyecto(Long id) {
        proyectoRep.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto pro = proyectoRep.findById(id).orElse(null);
        return pro;
    }

    @Override
    public void editProyecto(Proyecto project) {
        proyectoRep.save(project);
    }
    
    
}
