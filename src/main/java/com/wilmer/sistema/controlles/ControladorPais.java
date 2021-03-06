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
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author wilme
 */
@RestController
@RequestMapping("/api/ventas/pais")
public class ControladorPais {

    @Autowired
    private PaisService paisService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/listar")
    public List<Pais> listarPaises() {
        List<Pais> lista = StreamSupport
                .stream(paisService.listarPais().spliterator(), false)
                .collect(Collectors.toList());
        return lista;
    }

    @PostMapping
    public ResponseEntity<?> agregar(@RequestBody Pais pais) {
        paisService.guardarPais(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }

    @GetMapping("/{nombre}")
    public List<Pais> listarPaisPorNombre(@PathVariable String nombre) {
        List<Pais> lista = StreamSupport.stream(paisService.listarPaisPorNombre(nombre).spliterator(), false)
                .collect(Collectors.toList());
        return lista;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        paisService.eliminarPaisPorId(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/edit")
    public ResponseEntity<?> modificarPais(@RequestBody Pais pais){
       paisService.guardarPais(pais);
       return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
    /*@PutMapping("/{id}")
	public ResponseEntity<?> modificarPais(@RequestBody Pais paisDetails,@PathVariable Long id){
		Optional<Pais> pais=paisService.encontrarPais(paisDetails);
		if(!empresa.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		//util las propiedades get y set
		pais.get().setNombre(paisDetails.getNombre());
		pais.get().setNumeroNit(empresaDetails.getNumeroNit());
		empresa.get().setFechaFundacion(empresaDetails.getFechaFundacion());
		empresa.get().setDireccion(empresaDetails.getDireccion());
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(empresa.get()));
	}*/
}
