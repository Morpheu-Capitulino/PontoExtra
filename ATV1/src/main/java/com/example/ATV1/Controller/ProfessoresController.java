package com.example.ATV1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ATV1.Entity.Departamento;
import com.example.ATV1.Entity.Professores;
import com.example.ATV1.Repositorios.DepartamentoRepository;
import com.example.ATV1.Repositorios.ProfessoresRepository;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

    private final ProfessoresRepository professoresRepository;

    public ProfessoresController(ProfessoresRepository professoresRepository) {
        this.professoresRepository = professoresRepository;
    }

    @PostMapping
    public Professores createDepartamento(@RequestBody Professores professores) {
        return professoresRepository.save(professores);
    }
}
