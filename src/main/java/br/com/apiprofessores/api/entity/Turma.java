package br.com.apiprofessores.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "cod")
    private String cod; 

    @Column (name = "Turma")
    private String turma; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
