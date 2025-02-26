package com.example.curso.Model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    // Atributos
    private Long idCurso;
    private String nome;
    private int numeroSala;
    private List<Aluno> alunos;
    private Professor professor;

    // Bob construtor c/ parametros
    public Curso(Long idCurso, String nome, int numeroSala, Aluno alunos, Professor professor) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.numeroSala = numeroSala;
        this.alunos = new ArrayList<>();
        this.professor = professor;
    }

    // Getters and Setters

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
