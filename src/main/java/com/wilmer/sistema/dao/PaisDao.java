package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaisDao extends JpaRepository<Pais, Long>{
    
}
