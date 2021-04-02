package com.wilmer.sistema.service;

import java.util.List;
import com.wilmer.sistema.entity.Rol;
public interface RolService {
    public List<Rol> listarRoles();
    public void guardarRol(Rol rol);
    public void eliminarRol(Rol rol);
}
