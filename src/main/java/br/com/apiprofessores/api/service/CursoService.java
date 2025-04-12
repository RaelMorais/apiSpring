package br.com.apiprofessores.api.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.apiprofessores.api.entity.Curso;
import br.com.apiprofessores.api.repository.CursoRepository;

@Service
public class CursoService {
    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> create(Curso curso){
        cursoRepository.save(curso);
        return read();
    }

    public List<Curso> read(){
        Sort sort = Sort.by("cod").descending().and(
        Sort.by("curso").ascending()
        );
        return cursoRepository.findAll(); // Usado para evitar stackoverflow
    }
    public List<Curso> update(Curso curso){
        cursoRepository.save(curso);
        return read();
    }
    public List<Curso> delete(Long id){
        cursoRepository.deleteById(id);
        return read();
    }
}
