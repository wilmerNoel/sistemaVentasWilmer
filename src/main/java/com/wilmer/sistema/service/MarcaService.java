/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

/**
 *
 * @author wilme
 */
import com.wilmer.sistema.entity.Marca;
import java.util.List;
public interface MarcaService {
    public List<Marca> listarMarca();
    public void guardarMarca(Marca marca);
    public void eliminarMarca(Marca marca);
    public Marca encontrarMarca(Marca marca);
}
