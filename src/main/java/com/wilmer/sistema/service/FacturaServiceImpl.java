/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.FacturaDao;
import com.wilmer.sistema.entity.Factura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author wilme
 */
public class FacturaServiceImpl implements FacturaService{
    @Autowired
    public FacturaDao facturaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Factura> listarFactura() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarFactura(Factura factura) {
        facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void eliminarFactura(Factura factura) {
        facturaDao.delete(factura);
    }

    @Override
    @Transactional
    public Factura encontrarFactura(Factura factura) {
        return facturaDao.findById(factura.getIdFactura()).orElse(null);
    }
    
}
