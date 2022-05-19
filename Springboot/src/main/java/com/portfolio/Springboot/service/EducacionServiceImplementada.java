
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Educacion;
import com.portfolio.Springboot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImplementada implements EducacionService{
    
    @Autowired
    private EducacionRepository educRep;
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEduc = educRep.findAll();
        return listaEduc;
        }

    @Override
    public void altaEducacion(Educacion educacion) {
        educRep.save(educacion);
    }

    @Override
    public void bajaEducacion(Long id) {
        educRep.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educ = educRep.findById(id).orElseThrow(() -> {
            return null; 
        });
        return educ;
    }

    @Override
    public void editEducacion(Educacion educacion) {
        educRep.save(educacion);
    }
    
}
