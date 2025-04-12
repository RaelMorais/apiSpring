package br.com.apiprofessores.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Cursos")
public class Curso {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id; 

    @Column (name = "codigo")
    private String cod; 

    @Column (name = "curso")
    private String curso; 

    @Column (name = "tipo")
    @Enumerated(value = EnumType.STRING)
    private TiposEnum tipos; 

    @Column (name = "horaAula")
    private Integer ha; 
    
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public TiposEnum getTipos() {
        return tipos;
    }

    public void setTipos(TiposEnum tipos) {
        this.tipos = tipos;
    }

    public Integer getHa() {
        return ha;
    }

    public void setHa(Integer ha) {
        this.ha = ha;
    } 
}
