package edu.com.admescolar.service;

import edu.com.admescolar.model.Aluno;
import edu.com.admescolar.model.Professor;
import edu.com.admescolar.repository.AlunoRepository;
import edu.com.admescolar.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class EscolaService {
        private final AlunoRepository alunoRepository;
        private final ProfessorRepository professorRepository;

        @Autowired
        public EscolaService(AlunoRepository alunoRepository, ProfessorRepository professorRepository) {
            this.alunoRepository = alunoRepository;
            this.professorRepository = professorRepository;
        }

        // Métodos CRUD para Aluno
        public Aluno adicionarAluno(Aluno aluno) {
            return alunoRepository.save(aluno);
        }

        public List<Aluno> listarAlunos() {
            return alunoRepository.findAll();
        }

        public Aluno atualizarAluno(Long id, Aluno alunoDetails) {
            Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
            aluno.setNome(alunoDetails.getNome());
            aluno.setIdade(alunoDetails.getIdade());
            aluno.setMatricula(alunoDetails.getMatricula());
            return alunoRepository.save(aluno);
        }

        public void removerAluno(Long id) {
            Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
            alunoRepository.delete(aluno);
        }

        // Métodos CRUD para Professor
        public Professor adicionarProfessor(Professor professor) {
            return professorRepository.save(professor);
        }

        public List<Professor> listarProfessores() {
            return professorRepository.findAll();
        }

        public Professor atualizarProfessor(Long id, Professor professorDetails) {
            Professor professor = professorRepository.findById(id).orElseThrow(() -> new RuntimeException("Professor não encontrado"));
            professor.setNome(professorDetails.getNome());
            professor.setIdade(professorDetails.getIdade());
            professor.setDisciplina(professorDetails.getDisciplina());
            return professorRepository.save(professor);
        }

        public void removerProfessor(Long id) {
            Professor professor = professorRepository.findById(id).orElseThrow(() -> new RuntimeException("Professor não encontrado"));
            professorRepository.delete(professor);
        }
    }

