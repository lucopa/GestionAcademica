package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Telefono;

public interface RepoTelefono extends JpaRepository<Telefono, Integer> {
    
}
