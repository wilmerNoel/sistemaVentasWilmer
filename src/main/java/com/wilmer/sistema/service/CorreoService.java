/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Correo;
public interface CorreoService {
    public List<Correo> listarCorreo();
    public void guardarCorreo(Correo correo);
    public void eliminarCorreo(Correo correo);
    public Correo encontrarCorreo(Correo correo);
}
