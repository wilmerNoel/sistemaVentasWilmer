/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.controlles;

import com.wilmer.sistema.service.UsuarioService;
import com.wilmer.sistema.entity.Usuario;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilme
 */
@RestController
@RequestMapping("/api/ventas/usuarios/")
public class ControladorUsuario {
    @Autowired
    private UsuarioService usuarioService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("listar")
    public List<Usuario> listarUsuarios(){
        List<Usuario> lista = StreamSupport
                .stream(usuarioService.listarUsuario().spliterator(), false)
                .collect(Collectors.toList());  
       
        return lista;
}
    @PostMapping("guardar")
    public ResponseEntity<?> guardar(@RequestBody Usuario usuario){
        usuarioService.guardarUsuaerio(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
    
    @DeleteMapping("eliminar")
    public ResponseEntity<?> eliminar(@RequestBody Usuario usuario){
        usuarioService.eliminarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
}
