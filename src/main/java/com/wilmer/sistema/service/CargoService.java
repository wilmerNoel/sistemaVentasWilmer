package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Cargo;
public interface CargoService {
    public List<Cargo> listarCargos();
    public void guardar(Cargo cargo);
    public void eliminar(Cargo cargo);
    public Cargo encontrarCargo(Cargo cargo);
}
