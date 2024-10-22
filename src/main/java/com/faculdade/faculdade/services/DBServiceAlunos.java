package com.faculdade.faculdade.services;

import com.faculdade.faculdade.entities.Alunos;
import com.faculdade.faculdade.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DBServiceAlunos {
    @Autowired
    private AlunosRepository alunosRepository;

    @Bean
    public void instanciarDBAlunos() {
        alunosRepository.saveAll(Arrays.asList());
    }


}
