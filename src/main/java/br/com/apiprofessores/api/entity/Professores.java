package br.com.apiprofessores.api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Professores")
public class Professores {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ni; 
    private String  nome;
    private String cel;
    private String ocup;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNi() {
        return ni;
    }
    public void setNi(String ni) {
        this.ni = ni;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCel() {
        return cel;
    }
    public void setCel(String cel) {
        this.cel = cel;
    }
    public String getOcup() {
        return ocup;
    }
    public void setOcup(String ocup) {
        this.ocup = ocup;
    }


}
