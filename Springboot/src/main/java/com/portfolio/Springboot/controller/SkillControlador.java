
package com.portfolio.Springboot.controller;

import com.portfolio.Springboot.model.Skill;
import com.portfolio.Springboot.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
public class SkillControlador {
    
    @Autowired
    private SkillService skillSer;
    
    @GetMapping
    public List<Skill> getSkill(){
        return skillSer.getSkill();
    }
    @PostMapping
    public String altaSkill(@RequestBody Skill skill){
        skillSer.altaSkill(skill);
        return "Habilidad agregada...";
    }
    @DeleteMapping("/del/{id}")
    public String bajaSkill(@PathVariable Long id){
        skillSer.bajaSkill(id);
        return "Habilidad eliminada...";
    }
    @PutMapping("/edit/{id}")
    public Skill editSkill(@PathVariable Long id,
            @RequestParam("nombreSk") String new_nombre){
    
        Skill sk = skillSer.findSkill(id);
        sk.setNombreSk(new_nombre);
        
        skillSer.altaSkill(sk);
        return sk;
    }
    
}
