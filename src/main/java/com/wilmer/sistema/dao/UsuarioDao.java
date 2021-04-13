/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wilmer.sistema.entity.Usuario;
/**
 *
 * @author wilme
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    //Usuario findByUsername(String usuario);
}
