/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.PaisDao;
import com.wilmer.sistema.entity.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wilme
 */
@Service
public class PaisServiceImpl implements PaisService{
    @Autowired
    public PaisDao paisDao;
    @Override
    public List<Pais> listarPais() {
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public void guardarPais(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    public void eliminarPais(Pais pais) {
        paisDao.delete(pais);
    }

    @Override
    public Pais encontrarPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override
    public List<Pais> listarPaisPorNombre(String nombre) {
        return paisDao.listarPaisPorNombre(nombre);
    }

    @Override
    public void eliminarPaisPorId(Long id) {
        paisDao.deleteById(id);
    }
    
}
