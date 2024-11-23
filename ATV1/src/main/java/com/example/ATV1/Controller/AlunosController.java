package com.example.ATV1.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.ATV1.Entity.Alunos;
import com.example.ATV1.Repositorios.AlunosRepository;
import com.example.ATV1.Repositorios.CursosRepository;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    private final AlunosRepository alunoRepository;
    
    public AlunosController(AlunosRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Alunos> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Alunos createAluno(@RequestBody Alunos aluno) {
        return alunoRepository.save(aluno);
    }
}
