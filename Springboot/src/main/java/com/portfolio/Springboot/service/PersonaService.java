package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Persona;
import java.util.List;

public interface PersonaService {
    // Obtener las personas//
    public List<Persona> getPersona();
    //Alta de una Persona//
    public void altaPersona(Persona persona);
    //Baja de una Persona//
    public void bajaPersona(Long id);
    //Obtener una persona//
    public Persona findPersona(Long id);
    //Editar una persona//
    public void editPersona(Persona persona);
    
    
    
    
}
