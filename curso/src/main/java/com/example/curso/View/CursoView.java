package com.example.curso.View;

import com.example.curso.Controller.CursoController;
import com.example.curso.Model.Aluno;
import com.example.curso.Model.Curso;
import com.example.curso.Model.Professor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoView {
    CursoController cursoController = new CursoController();

    @GetMapping
    public List<Curso> getAll(
            @RequestParam(required = false) Long idProfessor,
            @RequestParam(required = false) Integer numeroSala

    ) {
        if (idProfessor != null) {
            return cursoController.getByProf(idProfessor);
        } else if (numeroSala != null) {
            return cursoController.getByNmrSala(numeroSala);
        } else {
            return cursoController.getAll();
        }
    }
    @GetMapping ("/{idCurso}")
    public Curso getById(@PathVariable Long idCurso) {
        return cursoController.getById(idCurso);
    }
    @PostMapping
    public boolean insert(@RequestBody Curso curso) {
        return cursoController.insert(curso);
    }
    @PutMapping("/{id}")
    public Curso update (@RequestBody Curso curso, @PathVariable Long idCurso){
        return cursoController.update(idCurso, curso);
    }
    @PostMapping("/aluno/{nomeCurso}")
    public boolean insertAluno(@PathVariable String nomeCurso, @RequestBody Aluno aluno) {
        return  cursoController.insertAluno(nomeCurso, aluno);
    }
    @DeleteMapping("/{idCurso}")
    public boolean delete(@PathVariable Long idCurso) {
        return cursoController.delete(idCurso);
    }

    @PutMapping("/{idCurso}/{idAluno}")
    public boolean updateAluno(@PathVariable Long idCurso, @PathVariable Long idAluno, @RequestBody Aluno alunoEdit) {
        return cursoController.updateAluno(idCurso, idAluno, alunoEdit);
    }

}


