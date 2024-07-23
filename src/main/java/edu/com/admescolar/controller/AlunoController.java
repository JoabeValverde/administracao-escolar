package edu.com.admescolar.controller;

import edu.com.admescolar.model.Aluno;
import edu.com.admescolar.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final EscolaService escolaService;

    @Autowired
    public AlunoController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @PostMapping
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        return escolaService.adicionarAluno(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return escolaService.listarAlunos();
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoDetails) {
        return escolaService.atualizarAluno(id, alunoDetails);
    }

    @DeleteMapping("/{id}")
    public void removerAluno(@PathVariable Long id) {
        escolaService.removerAluno(id);
    }
}
