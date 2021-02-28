/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.ProveedorDao;
import com.wilmer.sistema.entity.Proveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    @Autowired
    public ProveedorDao proveedorDao;
    @Override
    public List<Proveedor> listarProveedor() {
        return (List<Proveedor>) proveedorDao.findAll();
    }

    @Override
    public void guardarProveedor(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Override
    public void eliminarProveedor(Proveedor proveedor) {
        proveedorDao.delete(proveedor);
    }

    @Override
    public Proveedor encontrarProveedor(Proveedor proveedor) {
        return proveedorDao.findById(proveedor.getIdProveedor()).orElse(null);
    }
    
}
