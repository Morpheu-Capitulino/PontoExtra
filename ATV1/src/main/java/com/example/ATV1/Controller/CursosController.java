package com.example.ATV1.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.ATV1.Entity.Cursos;
import com.example.ATV1.Repositorios.CursosRepository;

import java.util.List;
@RestController
@RequestMapping("/cursos")
public class CursosController {

    private final CursosRepository cursoRepository;

    public CursosController(CursosRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping
    public List<Cursos> getAllCursos() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public Cursos createCurso(@RequestBody Cursos curso) {
        return cursoRepository.save(curso);
    }
}