package com.example.curso.Controller;

import com.example.curso.Banco.CursoBD;
import com.example.curso.Model.Aluno;
import com.example.curso.Model.Curso;
import com.example.curso.Model.Professor;

import java.util.List;

public class CursoController {

    CursoBD repositorio = new CursoBD();

    //BUSCAR TUDO
    public List<Curso> getAll() {
        return repositorio.findAll();
    }

    //BUSCA PELO ID!!!
    public Curso getById(Long id) {
        return repositorio.getByID(id);
    }

    //ADD CURSO COM ALUNO E PROFESSOR
    public boolean insert(Curso curso){
        return repositorio.insert(curso);
    }

    //UPDATE
    public Curso update(Long idCurso, Curso curso) {
        boolean result = repositorio.update(idCurso, curso);

        if(result) {
            return curso;
        }

        return null;
    }

    //DELETE
    public boolean delete(Long idCurso) {
        return repositorio.delete(idCurso);
    }

    //BUSCAR PELO NMR DA SALA
    public List<Curso> getByNmrSala(int numeroSala) {
        return repositorio.getByNmrSala(numeroSala);
    }

    //BUSCAR PELO PROFESSOR
    public List<Curso> getByProf(Long idProfessor) {
        return repositorio.getByProf(idProfessor);
    }


}
