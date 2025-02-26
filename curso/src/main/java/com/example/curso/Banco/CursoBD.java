package com.example.curso.Banco;

import com.example.curso.Model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoBD {

    public List<Curso> cursos;

    public CursoBD() {
        this.cursos = new ArrayList<>();
    }


    // Buscar todos os cursos
    public List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    // Buscar curso com base no professor
    public List<Curso> getByProf(Long idProfessor) {
        return cursos.stream()
                .filter(curso -> curso.getProfessor()
                        .getIdProfessor() == idProfessor)
                .toList();
    }

    // Buscar cursos com base no nmr da sala
    public List<Curso> getByNmrSala(int numeroSala) {
        return cursos.stream()
                .filter(curso -> curso.getNumeroSala() == numeroSala)
                .toList();
    }

    // Buscar com base no ID do curso
    public Curso getByID(Long idCurso) {
        return cursos.stream()
                .filter(curso -> curso.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
    }

    // Cadastrar Curso, alunos e professor
    public boolean insert(Curso curso) {
        cursos.add(curso);
        return  true;
    }

    // Adicionar aluno ao curso ja criado


    // Atualizar os dados de um curso e seu prof


    // Atualizar dados de um curso
    public boolean update(Long idCurso, Curso curso) {
        Curso cursoBD = cursos.stream()
                .filter(cursoFiltro -> cursoFiltro.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);

        if (cursoBD == null) {
            return false;
        }

        cursoBD.setNome(curso.getNome());
        cursoBD.setNumeroSala(curso.getNumeroSala());
        cursoBD.setProfessor(curso.getProfessor());
        cursoBD.setAlunos(curso.getAlunos());

        return true;
    }

    // Deletar curso
    public boolean delete(Long idCurso) {
        Curso cursoBD = cursos.stream()
                .filter(cursoFiltro -> cursoFiltro.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);

        if (cursoBD == null) {
            return false;
        }
        cursos.remove(cursoBD);
        return true;
    }
}
