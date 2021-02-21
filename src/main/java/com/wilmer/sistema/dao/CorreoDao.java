package com.wilmer.sistema.dao;

import com.wilmer.sistema.entity.Correo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CorreoDao extends JpaRepository<Correo, Long>{
    
}
