/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.controlles;

import com.wilmer.sistema.entity.Pais;
import com.wilmer.sistema.service.CiudadService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wilmer.sistema.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author wilme
 */
@RestController
@RequestMapping("/api/ventas/ciudad")
public class ControladorCiudad {
    @Autowired
    private CiudadService ciudadService;
    
    @GetMapping
    public List<Ciudad> listarCiudad() {
        List<Ciudad> lista = StreamSupport
                .stream(ciudadService.listarCiudad().spliterator(), false)
                .collect(Collectors.toList());
        return lista;
    }

    @PostMapping
    public ResponseEntity<?> agregar(@RequestBody Ciudad ciudad) {
        ciudadService.guardar(ciudad);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
}
