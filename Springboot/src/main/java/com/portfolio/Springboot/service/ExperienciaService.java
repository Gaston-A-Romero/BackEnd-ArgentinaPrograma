
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Experiencia_Laboral;
import java.util.List;


public interface ExperienciaService {
    public List<Experiencia_Laboral> getExp();
    public void altaExp(Experiencia_Laboral exp);
    public void bajaExp(Long id);
    public Experiencia_Laboral findExp(Long id);
    public void editExp(Experiencia_Laboral exp);
    
}
