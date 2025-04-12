package br.com.apiprofessores.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiprofessores.api.entity.Disciplina;

public interface DisciplinasRepository extends JpaRepository<Disciplina, Long>{
    
}
