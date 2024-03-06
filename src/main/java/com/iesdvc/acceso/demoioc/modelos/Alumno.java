package com.iesdvc.acceso.demoioc.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 50)
    private String usuario;
    
    @Column
    private String password;
    
    @Column(length = 50)
    private String nombre;
    
    @Column(length = 50)
    private String apellido;
    
    @Column(length = 15)
    private String telefono;
    
    @Column(length = 100)
    private String email;
}

