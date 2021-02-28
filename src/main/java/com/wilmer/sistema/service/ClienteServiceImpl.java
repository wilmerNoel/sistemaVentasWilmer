package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.ClienteDao;
import com.wilmer.sistema.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    public ClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarCliente() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void guardarCliente(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminarCliente(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente encontrarCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
    
}
