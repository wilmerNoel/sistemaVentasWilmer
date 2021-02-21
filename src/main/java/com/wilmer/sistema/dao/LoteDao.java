package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LoteDao extends JpaRepository<Lote, Long>{
    
}
