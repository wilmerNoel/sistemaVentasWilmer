/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.dao;

/**
 *
 * @author wilme
 */
import com.wilmer.sistema.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteDao extends JpaRepository<Cliente, Long>{
    
}
