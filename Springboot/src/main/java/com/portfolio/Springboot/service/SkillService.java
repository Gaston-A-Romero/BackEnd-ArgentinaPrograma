
package com.portfolio.Springboot.service;

import com.portfolio.Springboot.model.Skill;
import java.util.List;


public interface SkillService {
    public List<Skill> getSkill();
    public void altaSkill(Skill skill);
    public void bajaSkill(Long id);
    public Skill findSkill(Long id);
    public void editSkill(Skill skill);
    
}
