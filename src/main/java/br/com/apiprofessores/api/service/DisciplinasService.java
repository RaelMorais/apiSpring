package br.com.apiprofessores.api.service;

import java.util.List;


import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.apiprofessores.api.entity.Disciplina;
import br.com.apiprofessores.api.repository.DisciplinasRepository;

@Service
public class DisciplinasService {
    public DisciplinasService(DisciplinasRepository disciplinasRepository) {
        this.disciplinasRepository = disciplinasRepository;
    }

    private DisciplinasRepository disciplinasRepository;


    public List<Disciplina> create(Disciplina disciplina){
        disciplinasRepository.save(disciplina);
        return list();

        
    }

    public List<Disciplina> list(){
        Sort sort = Sort.by("cod").descending().and(
            Sort.by("ch").ascending()
        );
        return list();
    }

    public List<Disciplina> update(Disciplina disciplina){
        disciplinasRepository.save(disciplina);
        return list();
    }

    public List<Disciplina> delete(Long id){
        disciplinasRepository.deleteById(id);
        return list();
    }


}
