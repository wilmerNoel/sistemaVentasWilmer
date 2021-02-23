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
import com.wilmer.sistema.entity.DetalleFactura;
import java.util.List;
public interface DetalleFacturaService {
    public List<DetalleFactura> listarDettaleFactura();
    public void guardarDetalleFactura(DetalleFactura detalleFactura);
    public void eliminarDetalleFactura(DetalleFactura detalleFactura);
    public DetalleFactura encontrarDetalleFactura(DetalleFactura detalleFactura);
}
