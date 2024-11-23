package com.example.ATV1.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ATV1.Entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

	Departamento save(DepartamentoRepository departamento);
}
