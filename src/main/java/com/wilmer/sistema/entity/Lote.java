/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */        
package com.wilmer.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author wilme
 */
@Entity
@Data
@Table(name = "lotes")
public class Lote implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdLote;
    
    @Column(length = 100, nullable = false)
    private String descripcion;
    
    @Column
    private Date fechaIngreso;
    
    @Column
    private Date fechaVence;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor idProveedor;
}
