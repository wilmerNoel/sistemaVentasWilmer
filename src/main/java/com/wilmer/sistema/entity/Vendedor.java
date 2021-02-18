/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author wilme
 */
@Entity
@Data
@Table(name = "vendedores")
public class Vendedor implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVendedor;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 80, nullable = false)
    private String apellido;
    @Column(length = 80, nullable = false)
    private String telefono;
    
    @OneToOne
    @JoinColumn(name = "id_correo")
    private Correo idCorreo;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor idProveedor;
}
