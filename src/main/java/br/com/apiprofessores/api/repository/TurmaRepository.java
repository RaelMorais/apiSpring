package br.com.apiprofessores.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiprofessores.api.entity.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    
}
