package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.MarcaDao;
import com.wilmer.sistema.entity.Marca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MarcaServiceImpl implements MarcaService{
    @Autowired
    public MarcaDao marcaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Marca> listarMarca() {
        return (List<Marca>) marcaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarMarca(Marca marca) {
        marcaDao.save(marca);
    }

    @Override
    @Transactional
    public void eliminarMarca(Marca marca) {
        marcaDao.delete(marca);
    }

    @Override
    @Transactional(readOnly = true)
    public Marca encontrarMarca(Marca marca) {
        return marcaDao.findById(marca.getIdMarca()).orElse(null);
    }
    
}
