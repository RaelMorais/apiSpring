package br.com.apiprofessores.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprofessores.api.entity.Professores;
import br.com.apiprofessores.api.service.ProfessoresService;

@RestController
@RequestMapping("prof/")
public class ProfessoresController {
    private ProfessoresService professoresService;

    public ProfessoresController(ProfessoresService professoresService) {
        this.professoresService = professoresService;
    }

    @PostMapping
    List<Professores> create(@RequestBody Professores professores){
        return professoresService.create(professores);
    }

    @GetMapping
    List<Professores> list(){
        return professoresService.list();
    }

    @PutMapping
    List <Professores> update(@RequestBody Professores professores){
        return professoresService.update(professores);
    }

    @DeleteMapping("{id}")
    List<Professores> delete(@PathVariable("id") Long id){
        return professoresService.delete(id);
    }

}
