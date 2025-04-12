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

import br.com.apiprofessores.api.service.DisciplinasService;
import br.com.apiprofessores.api.entity.Disciplina;

@RestController
@RequestMapping("disc/")
public class DisciplinaController {
    private DisciplinasService disciplinasService;

    public DisciplinaController(DisciplinasService disciplinasService) {
        this.disciplinasService = disciplinasService;
    }
    
    @PostMapping
    public List<Disciplina> create(@RequestBody Disciplina disciplina) {
        return disciplinasService.create(disciplina);
    }

    @GetMapping
    public List<Disciplina> list() {
        return disciplinasService.list();
    }

    @PutMapping
    public List<Disciplina> update(@RequestBody Disciplina disciplina) {
        return disciplinasService.update(disciplina);
    }

    @DeleteMapping("{id}")
    public List<Disciplina> delete(@PathVariable("id") Long id) {
        return disciplinasService.delete(id);
    }

}
