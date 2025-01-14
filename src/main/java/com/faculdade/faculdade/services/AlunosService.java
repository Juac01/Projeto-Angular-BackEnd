package com.faculdade.faculdade.services;
import com.faculdade.faculdade.entities.Alunos;
import com.faculdade.faculdade.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class AlunosService {
    @Autowired
    AlunosRepository alunoRepository;

    public List<Alunos> listarTodosAbertos(){
        List<Alunos> alunos = alunoRepository.listarTodosAbertos();
        return alunos;
    }
    public List<Alunos> listarTodosFechados(){
        List<Alunos> alunos = alunoRepository.listarTodosFechados();
        return alunos;
    }


    public Alunos findById(int id) {
        Optional<Alunos> aluno = alunoRepository.findById(id);
        return aluno.orElse(null);
    }

    public List<Alunos> findAll() {
        List<Alunos> alunos = alunoRepository.findAll();
        return alunos;
    }




    public Alunos gravarAluno(Alunos aluno){
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Integer id){
        alunoRepository.deleteById(id);
    }

    public Alunos updateAlunos(Integer id,Alunos aluno){
        Alunos alterado = findById(id);
        if(alterado != null){
            alterado.setNome(aluno.getNome());
            alterado.setRa(aluno.getRa());
            alterado.setCep(aluno.getCep());
            alterado.setNumero(aluno.getNumero());
            alterado.setComplemento(aluno.getComplemento());
            alterado.setNotaAdo1(aluno.getNotaAdo1());
            alterado.setNotaPI(aluno.getNotaPI());
            alterado.setAtivo(aluno.isAtivo());
            return alunoRepository.save(alterado);
        }
        return null;
    }
}
