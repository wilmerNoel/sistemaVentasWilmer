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
import com.wilmer.sistema.entity.Factura;
import java.util.List;
public interface FacturaService {
    public List<Factura> listarFactura();
    public void guardarFactura(Factura factura);
    public void eliminarFactura(Factura factura);
    public Factura encontrarFactura(Factura factura);
}
