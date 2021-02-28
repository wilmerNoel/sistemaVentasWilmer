/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import java.util.List;

/**
 *
 * @author wilme
 */
import com.wilmer.sistema.entity.Pais;
public interface PaisService {
    public List<Pais> listarPais();
    public void guardarPais(Pais pais);
    public void eliminarPais(Pais pais);
    public Pais encontrarPais(Pais pais);
}
