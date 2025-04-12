package br.com.apiprofessores.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiprofessores.api.entity.Professores;

public interface ProfessoresRepository extends JpaRepository<Professores, Long> {
    
}
