package br.com.apiprofessores.api.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.apiprofessores.api.entity.Professores;
import br.com.apiprofessores.api.repository.ProfessoresRepository;

@Service 
public class ProfessoresService {
    private ProfessoresRepository professoresRepository;

    public ProfessoresService(ProfessoresRepository professoresRepository) {
        this.professoresRepository = professoresRepository;
    }

    public List<Professores> create(Professores professores){
        professoresRepository.save(professores);
        return list();
    }


    public List<Professores> list(){
        Sort sort = Sort.by("ni").descending().and(
            Sort.by("nome").ascending()
    );
    return professoresRepository.findAll(sort);
    }

    public List<Professores> update(Professores professores){
        professoresRepository.save(professores);
        return list();
    }

    public List<Professores> delete(Long id){
        professoresRepository.deleteById(id);
        return list();

    }
}
