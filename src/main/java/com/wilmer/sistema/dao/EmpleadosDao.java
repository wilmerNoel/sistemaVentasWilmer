package com.wilmer.sistema.dao;

import com.wilmer.sistema.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpleadosDao extends JpaRepository<Empleado, Long>{
    
}
