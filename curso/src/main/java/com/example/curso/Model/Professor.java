package com.example.curso.Model;

public class Professor {

    private Long idProfessor;
    private String nome;
    private String cpf;
    private double salario;

    //metodos
    Professor(){}
    Professor(Long idProfessor, String nome, String cpf, double salario){
    this.idProfessor = idProfessor;
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    }

    //getset
    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
