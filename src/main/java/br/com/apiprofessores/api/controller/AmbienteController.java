package br.com.apiprofessores.api.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiprofessores.api.entity.Ambiente;
import br.com.apiprofessores.api.service.AmbienteService;

@RestController
@RequestMapping("ambi/")
@Tag(name = "/usuario")
public class AmbienteController {

    private final AmbienteService ambienteService;
    

    public AmbienteController(AmbienteService ambienteService) {
        this.ambienteService = ambienteService;
    }


    @PostMapping
    @Operation(summary = "Salva o ambiente escolar", description = "Métodod para salvar ambiente")
    @ApiResponse(responseCode = "201", description = "Usuario gravado com sucesso")
    @ApiResponse(responseCode = "400", description = "Ambiente já cadastrado")
    @ApiResponse(responseCode = "500", description = "Erro no servidor")
    public List<Ambiente> create(@RequestBody Ambiente ambiente) {
        return ambienteService.create(ambiente);
    }

    @GetMapping
    public List<Ambiente> list() {
        return ambienteService.read();
    }


    @PutMapping
    public List<Ambiente> update(@RequestBody Ambiente ambiente) {
        return ambienteService.update(ambiente);
    }

    @DeleteMapping("{id}")
    public List<Ambiente> delete(@PathVariable Long id) {
        return ambienteService.delete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ambiente> getAmbienteById(@PathVariable Long id) {
        try {
            Ambiente ambiente = ambienteService.getById(id); // Usando o método getById
            return ResponseEntity.ok(ambiente);  // Se encontrado, retorna 200 OK com o ambiente
        } catch (RuntimeException ex) {
            return ResponseEntity.status(404).body(null);  // Se não encontrado, retorna 404 Not Found
        }
    }
    
}
