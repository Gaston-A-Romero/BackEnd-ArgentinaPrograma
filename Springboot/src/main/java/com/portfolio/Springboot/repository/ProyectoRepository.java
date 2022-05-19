
package com.portfolio.Springboot.repository;

import com.portfolio.Springboot.model.Proyecto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{
    
}
