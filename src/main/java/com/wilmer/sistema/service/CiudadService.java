/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Ciudad;
/**
 *
 * @author wilme
 */
public interface CiudadService {
    public List<Ciudad> listarCiudad();
    public void guardar(Ciudad ciudad);
    public void eliminarCiudad(Ciudad ciudad);
    public Ciudad encontrarCiudad(Ciudad ciudad);
    public void eliminarCiudadPorId(Long id);
}
