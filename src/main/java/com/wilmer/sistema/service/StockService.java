package com.wilmer.sistema.service;

import com.wilmer.sistema.entity.Stock;
import java.util.List;
public interface StockService {
    public List<Stock> listarStock();
    public void guardarStock(Stock stock);
    public void eliminarStock(Stock stock);
    public Stock encontrarStock(Stock stock);
}
