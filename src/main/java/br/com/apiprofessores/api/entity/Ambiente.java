package br.com.apiprofessores.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table (name = "Ambientes")
public class Ambiente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Long id;

    @Column(name = "sala") // Sala 
    private String sala; 

    @Column (name = "cap") // Capacidade maxima de alunos 
    private String cap;

    @Column (name = "resp") // Responsavel 
    private String resp;

    @Column (name = "per") // Enum para escolha de periodos
    @Enumerated(value = EnumType.STRING)
    private PeriodosEnum periodo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public PeriodosEnum getPer() {
        return periodo;
    }

    public void setPer(PeriodosEnum periodo) {
        this.periodo = periodo;
    }

}
