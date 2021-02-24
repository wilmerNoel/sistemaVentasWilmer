/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Lote;
/**
 *
 * @author wilme
 */
public interface LoteService {
    public List<Lote> listarLote();
    public void guardarLote(Lote lote);
    public void eliminarLote(Lote lote);
    public Lote encontrarLote(Lote lote);
}
