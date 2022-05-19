
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Skill;
import com.portfolio.Springboot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImplementado implements SkillService{
    @Autowired
    private SkillRepository skillRep;
    @Override
    public List<Skill> getSkill() {
        List<Skill> listaSkills = skillRep.findAll();
        return listaSkills;
        
    }

    @Override
    public void altaSkill(Skill skill) {
        skillRep.save(skill);
    }

    @Override
    public void bajaSkill(Long id) {
        skillRep.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = skillRep.findById(id).orElseThrow(() -> {
            return null;
        });
        return skill;
    }

    @Override
    public void editSkill(Skill skill) {
        skillRep.save(skill);
    }
    
}
