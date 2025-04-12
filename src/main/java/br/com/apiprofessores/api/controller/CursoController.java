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

import br.com.apiprofessores.api.entity.Curso;
import br.com.apiprofessores.api.service.CursoService;

@RestController
@RequestMapping("curso/")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public ResponseEntity<List<Curso>> create(@RequestBody Curso curso) {
        try{
        List<Curso> createdCursos = cursoService.create(curso);
        return new ResponseEntity<>(createdCursos, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            
        }
    }

    @GetMapping
    public ResponseEntity<List<Curso>> list() {
        try{
        List<Curso> cursos = cursoService.read();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping
    public ResponseEntity<List<Curso>> update(@RequestBody Curso curso) {
        try{
        List<Curso> updateCursos = cursoService.update(curso);
        return new ResponseEntity<>(updateCursos, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        }
        
    }

    @DeleteMapping("{id}")
    public ResponseEntity<List<Curso>> delete(@PathVariable Long id) {
        try{
        List<Curso> remanCursos = cursoService.delete(id);
        return new ResponseEntity<>(remanCursos, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
}
