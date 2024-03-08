package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Rol;

public interface RepoRol extends JpaRepository<Rol,Long>{
    
}
