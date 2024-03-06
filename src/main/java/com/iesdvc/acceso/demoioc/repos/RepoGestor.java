package com.iesdvc.acceso.demoioc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iesdvc.acceso.demoioc.modelos.Gestor;

public interface RepoGestor extends JpaRepository<Gestor, Long> {
    
}
