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
import com.wilmer.sistema.entity.Vendedor;
import java.util.List;
public interface VendedorService {
    public List<Vendedor> listarVendedor();
    public void guardarVendedor(Vendedor vendedor);
    public void eliminarVendedor(Vendedor vendedor);
    public Vendedor encontrarVendedor(Vendedor vendedor);
}
