package com.iesdvc.acceso.demoioc.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 50)
    private String nombre;
    
    @Column
    private int curso;
    
    @Column(length = 50)
    private String ciclo;
    
    @ManyToMany
    private List<Profesor> profesores;
    
    
}

