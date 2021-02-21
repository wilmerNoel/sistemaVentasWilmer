/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProveedorDao extends JpaRepository<Proveedor, Long>{
    
}
