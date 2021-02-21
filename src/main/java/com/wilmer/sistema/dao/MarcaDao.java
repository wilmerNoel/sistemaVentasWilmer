package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MarcaDao extends JpaRepository<Marca, Long>{
    
}
