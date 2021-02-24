/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.LoteDao;
import com.wilmer.sistema.entity.Lote;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wilme
 */
public class LoteServiceImpl implements LoteService{
    public LoteDao loteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Lote> listarLote() {
        return (List<Lote>) loteDao.findAll();
    }

    @Override
    @Transactional
    public void guardarLote(Lote lote) {
        loteDao.save(lote);
    }

    @Override
    @Transactional
    public void eliminarLote(Lote lote) {
        loteDao.delete(lote);
    }

    @Override
    @Transactional(readOnly = true)
    public Lote encontrarLote(Lote lote) {
        return loteDao.findById(lote.getIdLote()).orElse(null);
    }
    
}
