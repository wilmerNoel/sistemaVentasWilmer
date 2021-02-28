package com.wilmer.sistema.service;

import com.wilmer.sistema.entity.Proveedor;
import java.util.List;
public interface ProveedorService {
    public List<Proveedor> listarProveedor();
    public void guardarProveedor(Proveedor proveedor);
    public void eliminarProveedor(Proveedor proveedor);
    public Proveedor encontrarProveedor(Proveedor proveedor);
}
