/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.CorreoDao;
import com.wilmer.sistema.entity.Correo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wilme
 */
public class CorreoServiceImpl implements CorreoService{
    @Autowired
    public CorreoDao correoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Correo> listarCorreo() {
        return (List<Correo>) correoDao.findAll();
    }

    @Override
    @Transactional
    public void guardarCorreo(Correo correo) {
        correoDao.save(correo);
    }

    @Override
    @Transactional
    public void eliminarCorreo(Correo correo) {
        correoDao.delete(correo);
    }

    @Override
    @Transactional(readOnly = true)
    public Correo encontrarCorreo(Correo correo) {
        return correoDao.findById(correo.getIdCorreo()).orElse(null);
    }
    
}
