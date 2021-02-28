/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.EmpleadosDao;
import com.wilmer.sistema.entity.Empleado;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    public EmpleadosDao empleadosDao;
    @Override
    @Transactional(readOnly = true)
    public List<Empleado> listarEmpleado() {
        return (List<Empleado>) empleadosDao.findAll();
    }

    @Override
    @Transactional
    public void guardarEmpleado(Empleado empleado) {
        empleadosDao.save(empleado);
    }

    @Override
    @Transactional
    public void eliminarEmpleado(Empleado empleado) {
        empleadosDao.delete(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado encontrarEmpleado(Empleado empleado) {
        return empleadosDao.findById(empleado.getIdEmpleado()).orElse(null);
    }
    
}
