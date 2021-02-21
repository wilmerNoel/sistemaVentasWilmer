package com.wilmer.sistema.dao;

import com.wilmer.sistema.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteDao extends JpaRepository<Cliente, Long>{
    
}
