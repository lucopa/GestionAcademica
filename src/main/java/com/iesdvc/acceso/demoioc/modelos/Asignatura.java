package com.iesdvc.acceso.demoioc.modelos;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String curso;

    @Column(length = 100)
    private String nombre;

    @Column(length = 100)
    private String ciclo;

    @ManyToMany
    List<Usuario> usuarios;  
}
