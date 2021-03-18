package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.CiudadDao;
import com.wilmer.sistema.entity.Ciudad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CiudadServiceImpl implements CiudadService{
    @Autowired
    public CiudadDao ciudadDao;
    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listarCiudad() {
        return (List<Ciudad>) ciudadDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Ciudad ciudad) {
        ciudadDao.save(ciudad);
    }

    @Override
    @Transactional
    public void eliminarCiudad(Ciudad ciudad) {
        ciudadDao.delete(ciudad);
    }

    @Override
    @Transactional(readOnly = true)
    public Ciudad encontrarCiudad(Ciudad ciudad) {
       return ciudadDao.findById(ciudad.getIdCiudad()).orElse(null);
    }
    @Override
    public void eliminarCiudadPorId(Long id) {
        ciudadDao.deleteById(id);
    }
    
}
