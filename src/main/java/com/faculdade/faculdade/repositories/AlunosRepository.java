package com.faculdade.faculdade.repositories;

import com.faculdade.faculdade.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunosRepository
        extends JpaRepository<Alunos, Integer>{
    @Query("SELECT alunos FROM Alunos alunos "
            + "WHERE alunos.ativo=true ORDER BY alunos.nome")
    List<Alunos> listarTodosAbertos();

    @Query("SELECT alunos FROM Alunos alunos "
            + "WHERE alunos.ativo=false ORDER BY alunos.nome")
    List<Alunos> listarTodosFechados();


}

