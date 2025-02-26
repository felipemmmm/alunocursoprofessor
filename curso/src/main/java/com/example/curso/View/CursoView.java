package com.example.curso.View;

import com.example.curso.Controller.CursoController;
import com.example.curso.Model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoView {
    CursoController cursoController = new CursoController();

    @GetMapping
    public List<Curso> getAll() {
        return cursoController.getAll();
    }
    @GetMapping ("/{id}")
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
    @GetMapping ("/{idProfessor}")
    public List<Curso> getByProf(@PathVariable Long idProfessor) {
        return cursoController.getByProf(idProfessor);
    }
    @PutMapping()
}
