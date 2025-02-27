package com.example.curso.Banco;

import com.example.curso.Model.Aluno;
import com.example.curso.Model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoBD {

    public List<Curso> cursos;

    public CursoBD() {
        this.cursos = new ArrayList<>();
    }


    // 1. Buscar todos os cursos x
    public List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    // 2. Buscar curso com base no professor x
    public List<Curso> getByProf(Long idProfessor) {
        return cursos.stream()
                .filter(curso -> curso.getProfessor()
                        .getIdProfessor() == idProfessor)
                .toList();
    }

    // 3. Buscar cursos com base no nmr da sala x
    public List<Curso> getByNmrSala(int numeroSala) {
        return cursos.stream()
                .filter(curso -> curso.getNumeroSala() == numeroSala)
                .toList();
    }

    // 4. Buscar com base no ID do curso x
    public Curso getByID(Long idCurso) {
        return cursos.stream()
                .filter(curso -> curso.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
    }

    // 5. Cadastrar Curso, alunos e professor x
    public boolean insert(Curso curso) {
        cursos.add(curso);
        return  true;
    }

    // 6. Adicionar aluno ao curso ja criado x
    public boolean insertAluno(String nomeCurso, Aluno aluno) {
        Curso cursoBD = cursos.stream()
                .filter(cursoFiltro -> cursoFiltro.getNome().equals(nomeCurso))
                .findFirst()
                .orElse(null);

        if (cursoBD == null) {
            return false;
        }
        // Adicionando aluno
        cursoBD.getAlunos().add(aluno);

        return true;
    }

    // 7. Atualizar os dados de um curso e seu prof x
    public boolean upCursoProf(Long idCurso, Curso curso) {
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

        return true;
    }

    // 8. Atualizar os dados de um aluno de um curso x
    public boolean updateAluno(Long idCurso, Long idAluno) {
        // Procurando curso com base no idCurso
        Curso cursoBD = cursos.stream()
                .filter(curso -> curso.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
        // Procurando aluno com base no idAluno dentro do Obj cursoBD
        Aluno aluno = cursoBD.getAlunos().stream() // Procurando dentro da lista de "Alunos"
                .filter(alunoFiltro -> alunoFiltro.getIdAluno() == idAluno) // Filtra o aluno dentro da Lista com base no idAluno
                .findFirst() // Acha o primeiro com o idAluno
                .orElse(null); // Tratamento de erro
        // Retorna falso caso ñ ache o curso
        if (cursoBD == null) {
            return false;
        }
        // Atualizando infos do Aluno em especifico
        aluno.setNome(aluno.getNome());
        aluno.setCpf(aluno.getCpf());

        return true; // Se der certo
    }

    // Extra. Atualizar dados de um curso x
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

    // 9. Deletar curso x
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
