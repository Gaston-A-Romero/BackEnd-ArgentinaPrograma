/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Experiencia_Laboral;
import com.portfolio.Springboot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServiceImplementado implements ExperienciaService {
    
    @Autowired
    private ExperienciaRepository expRep;
    
    @Override
    public List<Experiencia_Laboral> getExp() {
        List<Experiencia_Laboral> listaExp = expRep.findAll();
        return listaExp;
    }

    @Override
    public void altaExp(Experiencia_Laboral exp) {
        expRep.save(exp);
    }

    @Override
    public void bajaExp(Long id) {
        expRep.deleteById(id);
    }

    @Override
    public Experiencia_Laboral findExp(Long id) {
        Experiencia_Laboral exp = expRep.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void editExp(Experiencia_Laboral exp) {
        expRep.save(exp);
    }
    
}
