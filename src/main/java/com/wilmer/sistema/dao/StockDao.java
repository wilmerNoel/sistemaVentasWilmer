/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.dao;
import com.wilmer.sistema.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StockDao extends JpaRepository<Stock, Long>{
    
}
