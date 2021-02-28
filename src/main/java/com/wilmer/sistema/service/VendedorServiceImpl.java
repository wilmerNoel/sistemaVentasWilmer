package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.VendedorDao;
import com.wilmer.sistema.entity.Vendedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorServiceImpl implements VendedorService{
    @Autowired
    public VendedorDao vendedorDao;
    @Override
    public List<Vendedor> listarVendedor() {
        return (List<Vendedor>) vendedorDao.findAll();
    }

    @Override
    public void guardarVendedor(Vendedor vendedor) {
        vendedorDao.save(vendedor);
    }

    @Override
    public void eliminarVendedor(Vendedor vendedor) {
        vendedorDao.delete(vendedor);
    }

    @Override
    public Vendedor encontrarVendedor(Vendedor vendedor) {
        return vendedorDao.findById(vendedor.getIdVendedor()).orElse(null);
    }
    
}
