package com.example.ATV1.Entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Alunos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(
      name = "aluno_curso", 
      joinColumns = @JoinColumn(name = "aluno_id"), 
      inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Cursos> cursos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}

    
}
