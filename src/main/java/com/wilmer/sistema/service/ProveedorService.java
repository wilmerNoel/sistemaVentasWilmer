package com.wilmer.sistema.service;

import com.wilmer.sistema.entity.Proveedor;
import java.util.List;
public interface ProveedorService {
    public List<Proveedor> listarProveedor();
    public void guardarProveedor(Proveedor marca);
    public void eliminarProveedor(Proveedor marca);
    public Proveedor encontrarProveedor(Proveedor marca);
}
