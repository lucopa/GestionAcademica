package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Asignatura;

public interface RepoAsignatura extends JpaRepository<Asignatura,Long> {
    
}
