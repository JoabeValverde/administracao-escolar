package edu.com.admescolar.model;

import jakarta.persistence.Entity;

@Entity (name = "tbm_aluno")
public class Aluno extends Pessoa {
    private String matricula;

    // Getters and Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
