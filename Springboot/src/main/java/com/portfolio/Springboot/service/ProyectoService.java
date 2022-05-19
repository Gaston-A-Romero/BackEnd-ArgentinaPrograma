
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Proyecto;
import java.util.List;


public interface ProyectoService {
    public List<Proyecto> getProyecto();
    public void altaProyecto(Proyecto project);
    public void bajaProyecto(Long id);
    public Proyecto findProyecto(Long id);
    public void editProyecto(Proyecto project);
    
}
