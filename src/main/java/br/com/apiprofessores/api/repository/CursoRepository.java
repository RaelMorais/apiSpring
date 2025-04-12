package br.com.apiprofessores.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiprofessores.api.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
