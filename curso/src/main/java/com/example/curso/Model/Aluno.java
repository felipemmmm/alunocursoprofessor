package com.example.curso.Model;

public class Aluno {
    // Atributos
    private Long idAluno;
    private String nome;
    private String cpf;

    // Bob Construtor c/ parametros
    public Aluno(Long idAluno, String nome, String cpf) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getter and Setters
    public Long getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
