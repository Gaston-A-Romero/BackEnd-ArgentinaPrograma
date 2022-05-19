
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Educacion;
import java.util.List;


public interface EducacionService {
    public List<Educacion> getEducacion();
    public void altaEducacion(Educacion educacion);
    public void bajaEducacion(Long id);
    public Educacion findEducacion(Long id);
    public void editEducacion(Educacion educacion);
    
}
