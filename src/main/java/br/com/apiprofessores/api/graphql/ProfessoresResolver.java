package br.com.apiprofessores.api.graphql;

import br.com.apiprofessores.api.entity.Professores;
import br.com.apiprofessores.api.service.ProfessoresService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProfessoresResolver {

    private final ProfessoresService professoresService;

    public ProfessoresResolver(ProfessoresService professoresService) {
        this.professoresService = professoresService;
    }

    // Consulta: Buscar todos os professores
    @QueryMapping
    public List<Professores> professores() {
        return professoresService.list();
    }

    // Mutação: Criar um professor
    @MutationMapping
    public List<Professores> createProfessor(
            @Argument String ni,
            @Argument String nome,
            @Argument String cel,
            @Argument String ocup
    ) {
        Professores newProfessor = new Professores();
        newProfessor.setNi(ni);
        newProfessor.setNome(nome);
        newProfessor.setCel(cel);
        newProfessor.setOcup(ocup);
        return professoresService.create(newProfessor);
    }

    // Mutação: Atualizar um professor
    @MutationMapping
    public List<Professores> updateProfessor(
            @Argument Long id,
            @Argument String ni,
            @Argument String nome,
            @Argument String cel,
            @Argument String ocup
    ) {
        Professores updatedProfessor = new Professores();
        updatedProfessor.setId(id);
        updatedProfessor.setNi(ni);
        updatedProfessor.setNome(nome);
        updatedProfessor.setCel(cel);
        updatedProfessor.setOcup(ocup);
        return professoresService.update(updatedProfessor);
    }

    // Mutação: Deletar um professor
    @MutationMapping
    public List<Professores> deleteProfessor(@Argument Long id) {
        return professoresService.delete(id);
    }
}