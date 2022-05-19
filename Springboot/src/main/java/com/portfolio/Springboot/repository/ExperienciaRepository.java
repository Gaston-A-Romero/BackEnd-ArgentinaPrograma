
package com.portfolio.Springboot.repository;

import com.portfolio.Springboot.model.Experiencia_Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia_Laboral,Long>{
    
}
