/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.controlles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wilmer.sistema.entity.Pais;
import com.wilmer.sistema.service.PaisService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author wilme
 */
@RestController
@RequestMapping("/api/ventas/pais")
public class ControladorPais {
    @Autowired
    private PaisService paisService;
    @GetMapping
    public List<Pais> listarPaises() {
        List<Pais> lista = StreamSupport
                .stream(paisService.listarPais().spliterator(), false)
                .collect(Collectors.toList());
        return lista;
    }
}
