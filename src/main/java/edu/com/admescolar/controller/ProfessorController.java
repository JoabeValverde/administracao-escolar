package edu.com.admescolar.controller;

import edu.com.admescolar.model.Professor;
import edu.com.admescolar.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private final EscolaService escolaService;

    @Autowired
    public ProfessorController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @PostMapping
    public Professor adicionarProfessor(@RequestBody Professor professor) {
        return escolaService.adicionarProfessor(professor);
    }

    @GetMapping
    public List<Professor> listarProfessores() {
        return escolaService.listarProfessores();
    }

    @PutMapping("/{id}")
    public Professor atualizarProfessor(@PathVariable Long id, @RequestBody Professor professorDetails) {
        return escolaService.atualizarProfessor(id, professorDetails);
    }

    @DeleteMapping("/{id}")
    public void removerProfessor(@PathVariable Long id) {
        escolaService.removerProfessor(id);
    }
}
