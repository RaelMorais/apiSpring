package br.com.apiprofessores.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprofessores.api.entity.Turma;
import br.com.apiprofessores.api.service.TurmaService;

@RestController
@RequestMapping("turma/")
public class TurmaController {

    private final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping
    public ResponseEntity<List<Turma>> createTurma(@RequestBody Turma turma) {
        List<Turma> turmas = turmaService.create(turma);
        return new ResponseEntity<>(turmas, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Turma>> getAllTurmas() {
        List<Turma> turmas = turmaService.read();
        return new ResponseEntity<>(turmas, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<List<Turma>> updateTurma(@RequestBody Turma turma) {
        List<Turma> turmas = turmaService.update(turma);
        return new ResponseEntity<>(turmas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Turma>> deleteTurma(@PathVariable Long id) {
        List<Turma> turmas = turmaService.delete(id);
        return new ResponseEntity<>(turmas, HttpStatus.OK);
    }

}
