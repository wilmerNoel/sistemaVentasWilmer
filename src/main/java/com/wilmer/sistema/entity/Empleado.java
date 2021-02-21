/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmer.sistema.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author wilme
 */
@Entity
@Data
@Table(name = "empleados")
public class Empleado implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    
    private String nombre;
    private String apellido;
    
    @OneToOne
    @JoinColumn(name = "id_cargo")
    private Cargo idCargo;
    private Double salario;
    @OneToOne
    @JoinColumn(name = "id_correo")
    private Correo idCorreo;
    private String direccion;
    private Integer identificacion;
}
