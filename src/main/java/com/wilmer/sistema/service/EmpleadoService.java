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
import com.wilmer.sistema.entity.Empleado;
import java.util.List;
public interface EmpleadoService {
    public List<Empleado> listarEmpleado();
    public void guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
    public Empleado encontrarEmpleado(Empleado empleado);
}
