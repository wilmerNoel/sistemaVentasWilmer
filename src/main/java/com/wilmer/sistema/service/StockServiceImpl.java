/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.StockDao;
import com.wilmer.sistema.entity.Stock;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    public StockDao stockDao;
    @Override
    public List<Stock> listarStock() {
        return (List<Stock>) stockDao.findAll();
    }

    @Override
    public void guardarStock(Stock stock) {
        stockDao.save(stock);
    }

    @Override
    public void eliminarStock(Stock stock) {
        stockDao.delete(stock);
    }

    @Override
    public Stock encontrarStock(Stock stock) {
        return stockDao.findById(stock.getIdStock()).orElse(null);
    }
    
}
