
package com.portfolio.Springboot.repository;

import com.portfolio.Springboot.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Long>{
    
}
