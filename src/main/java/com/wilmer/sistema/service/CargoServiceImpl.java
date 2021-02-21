package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.CargoDao;
import com.wilmer.sistema.entity.Cargo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CargoServiceImpl implements CargoService{
    @Autowired
    public CargoDao cargoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cargo> listarCargos() {
        return (List<Cargo>) cargoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cargo cargo) {
        cargoDao.save(cargo);
    }

    @Override
    public void eliminar(Cargo cargo) {
        cargoDao.delete(cargo);
    }

    @Override
    public Cargo encontrarCargo(Cargo cargo) {
        return cargoDao.findById(cargo.getIdCargo()).orElse(null);
    }
    
}
