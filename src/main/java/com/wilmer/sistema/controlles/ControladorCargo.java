/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.controlles;

import com.wilmer.sistema.service.CargoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wilmer.sistema.entity.Cargo;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author wilme
 */
@RestController
@RequestMapping("/ventas/api/cargos/")
public class ControladorCargo {
    @Autowired
    public CargoService cargoService;
    
    @GetMapping("listar")
    public List<Cargo> listarCargos(){
        List<Cargo> lista = StreamSupport
                .stream(cargoService.listarCargos().spliterator(),false)
                .collect(Collectors.toList());
        return lista;
    }
    public ResponseEntity<?> agregar(@RequestBody Cargo cargo){
        cargoService.guardar(cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
    public ResponseEntity<?> delete(@RequestBody Cargo cargo){
        cargoService.eliminar(cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
}
