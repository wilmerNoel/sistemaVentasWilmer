package com.wilmer.sistema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wilmer.sistema.entity.Cargo;

public interface CargoDao extends JpaRepository<Cargo, Long>{
    
}
