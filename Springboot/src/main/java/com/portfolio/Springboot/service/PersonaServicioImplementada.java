 
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Persona;
import com.portfolio.Springboot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServicioImplementada implements PersonaService{

    
    @Autowired
    private PersonaRepository perRep;
    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersonas = perRep.findAll();
        return listaPersonas;
    }

    @Override
    public void altaPersona(Persona persona) {
        perRep.save(persona);
    }
    
    @Override
    public void bajaPersona(Long id) {
        perRep.deleteById(id);        
    }
    
    @Override
    public Persona findPersona(Long id) {
        Persona persona = perRep.findById(id).orElseThrow(() -> {
            return null; 
        });
        return persona;
    }
    @Override
    public void editPersona(Persona persona){
        perRep.save(persona);
    }

    
    
    
    
}
