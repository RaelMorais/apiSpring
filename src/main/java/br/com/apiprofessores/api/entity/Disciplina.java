package br.com.apiprofessores.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Disciplinas")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cod;
    private String disc;
    private String ch;
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
    public String getDisc() {
        return disc;
    }
    public void setDisc(String disc) {
        this.disc = disc;
    }
    public String getCh() {
        return ch;
    }
    public void setCh(String ch) {
        this.ch = ch;
    }

}
