/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Cliente;
/**
 *
 * @author wilme
 */
public interface ClienteService{
    public List<Cliente> listarCliente();
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
    public Cliente encontrarCliente(Cliente cliente);
}
