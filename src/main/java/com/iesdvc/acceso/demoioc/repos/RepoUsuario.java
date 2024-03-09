package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesdvc.acceso.demoioc.modelos.Usuario;

public interface RepoUsuario extends JpaRepository<Usuario,Long> {
    
}
