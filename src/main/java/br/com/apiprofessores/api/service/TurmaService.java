package br.com.apiprofessores.api.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.apiprofessores.api.entity.Turma;
import br.com.apiprofessores.api.repository.TurmaRepository;

@Service
public class TurmaService {
    private TurmaRepository turmaRepository;

    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public List<Turma> create (Turma turma){
        turmaRepository.save(turma);
        return read();
        
    }

    public List<Turma> read(){
        Sort sort = Sort.by("turma").descending().and(
        Sort.by("cod").ascending()
    );
    return turmaRepository.findAll(sort);
    }

    public List<Turma> update (Turma turma){
        turmaRepository.save(turma);
        return read();
    }

    public List<Turma> delete (Long id){
        turmaRepository.deleteById(id);
        return read();
    }
}
