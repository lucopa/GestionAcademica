package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Profesor;

public interface RepoProfesor extends JpaRepository<Profesor, Long> {
    
}
