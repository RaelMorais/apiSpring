package br.com.apiprofessores.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.apiprofessores.api.entity.Ambiente;
import br.com.apiprofessores.api.repository.AmbienteRepository;

@Service
public class AmbienteService {
    private AmbienteRepository ambienteRepository;

    public AmbienteService(AmbienteRepository ambienteRepository) {
        this.ambienteRepository = ambienteRepository;
    }

    public List<Ambiente> create(Ambiente ambiente){
        ambienteRepository.save(ambiente);
        return read();
        
    }
    public List<Ambiente> read(){
            Sort sort = Sort.by("sala").descending().and(
            Sort.by("periodo").ascending()
        );
        return ambienteRepository.findAll(sort);
        
    }
    public List<Ambiente> update(Ambiente ambiente){
        ambienteRepository.save(ambiente);
        return read();
        
    }
    public List<Ambiente> delete(Long id){
        ambienteRepository.deleteById(id);
        return read();
        
    }

    public Ambiente getById(Long id) {
        Optional<Ambiente> ambiente = ambienteRepository.findById(id);
        // Retorna o Ambiente encontrado ou lança uma exceção se não encontrado
        return ambiente.orElseThrow(() -> new RuntimeException("Ambiente não encontrado com o ID: " + id));
    }

}
