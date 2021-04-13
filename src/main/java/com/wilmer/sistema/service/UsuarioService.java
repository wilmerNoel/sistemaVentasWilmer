/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.service;

import com.wilmer.sistema.entity.Usuario;
import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarUsuario();
    public void guardarUsuaerio(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
    public Usuario encontrarUsuario(Usuario usuario);
}
