package com.wilmer.sistema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wilmer.sistema.entity.Factura;
public interface DacturaDao extends JpaRepository<Factura, Long>{
    
}
