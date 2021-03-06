package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Pais;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface PaisDao extends JpaRepository<Pais, Long>{
    @Query("select p from Pais p where p.nombre like %:var_param%")
    public List<Pais> listarPaisPorNombre(@Param("var_param") String nombre);
}
