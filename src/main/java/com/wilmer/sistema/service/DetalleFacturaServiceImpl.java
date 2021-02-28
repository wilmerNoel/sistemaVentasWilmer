/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.DetalleFacturaDao;
import com.wilmer.sistema.entity.DetalleFactura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService{
    @Autowired
    public DetalleFacturaDao detalleFacturaDao;
    @Override
    @Transactional(readOnly = true)
    public List<DetalleFactura> listarDettaleFactura() {
        return (List<DetalleFactura>) detalleFacturaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarDetalleFactura(DetalleFactura detalleFactura) {
        detalleFacturaDao.save(detalleFactura);
    }

    @Override
    @Transactional
    public void eliminarDetalleFactura(DetalleFactura detalleFactura) {
        detalleFacturaDao.delete(detalleFactura);
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleFactura encontrarDetalleFactura(DetalleFactura detalleFactura) {
        return detalleFacturaDao.findById(detalleFactura.getIdDetalle()).orElse(null);
    }
    
}
