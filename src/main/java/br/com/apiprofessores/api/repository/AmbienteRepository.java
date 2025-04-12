package br.com.apiprofessores.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiprofessores.api.entity.Ambiente;

public interface AmbienteRepository extends JpaRepository<Ambiente, Long>{
    
}
