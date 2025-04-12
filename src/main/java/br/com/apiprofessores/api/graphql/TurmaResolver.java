package br.com.apiprofessores.api.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import br.com.apiprofessores.api.entity.Turma;
import br.com.apiprofessores.api.service.TurmaService;
// Criando o resolver para realizar as consultas 

@Controller
public class TurmaResolver {
   
    private final TurmaService turmaService;

    @Autowired
    public TurmaResolver(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

     @QueryMapping
    public List<Turma> turma() {
        return turmaService.read();
    }

}
