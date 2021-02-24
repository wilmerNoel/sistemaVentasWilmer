/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

/**
 *
 * @author wilme
 */
import com.wilmer.sistema.entity.Producto;
import java.util.List;
public interface ProductoService {
    public List<Producto> listarProducto();
    public void guardarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
    public Producto encontrarProducto(Producto producto);
}
