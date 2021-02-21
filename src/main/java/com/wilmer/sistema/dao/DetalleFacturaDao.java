package com.wilmer.sistema.dao;

import com.wilmer.sistema.entity.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DetalleFacturaDao extends JpaRepository<DetalleFactura, Long>{
    
}
