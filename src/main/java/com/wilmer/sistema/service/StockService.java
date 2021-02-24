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
import com.wilmer.sistema.entity.Stock;
import java.util.List;
public interface StockService {
    public List<Stock> listarStock();
    public void guardarStock(Stock stock);
    public void eliminarStock(Stock stock);
    public Stock encontrarStock(Stock stock);
}
