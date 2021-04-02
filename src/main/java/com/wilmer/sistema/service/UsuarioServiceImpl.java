package com.wilmer.sistema.service;

import com.wilmer.sistema.dao.UsuarioDao;
import com.wilmer.sistema.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    public UsuarioDao usuarioDao;
    @Override
    public List<Usuario> listarUsuario() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public void guardarUsuaerio(Usuario usuario) {
        String pass = usuario.getPassword();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode(pass);
        usuario.setPassword(password);
        //System.out.println("pais encriptado: "+ usuario.getPassword());
        usuarioDao.save(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public Usuario encontrarUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }
    
}
