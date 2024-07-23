package edu.com.admescolar.model;


import jakarta.persistence.Entity;

@Entity(name = "tb_professor")
public class Professor extends Pessoa {
    private String disciplina;

    // Getters and Setters


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

