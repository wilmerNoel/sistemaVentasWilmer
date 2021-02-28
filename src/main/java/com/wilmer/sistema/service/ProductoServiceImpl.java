/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.ProductoDao;
import com.wilmer.sistema.entity.Producto;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    public ProductoDao productoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProducto() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void guardarProducto(Producto producto) {
        productoDao.save(producto);
        
    }

    @Override
    @Transactional
    public void eliminarProducto(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto encontrarProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
    
}
