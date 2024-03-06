package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Alumno;

public interface RepoAlumno extends JpaRepository<Alumno, Long> {
    
}
