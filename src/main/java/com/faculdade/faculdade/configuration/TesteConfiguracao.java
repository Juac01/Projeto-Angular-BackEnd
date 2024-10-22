package com.faculdade.faculdade.configuration;

import com.faculdade.faculdade.services.DBServiceAlunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;
@Configuration
@Profile("teste")
public class TesteConfiguracao {
    @Autowired
    DBServiceAlunos dbServiceAlunos;

    private boolean instanciarDBAlunos() throws ParseException {
        this.dbServiceAlunos.instanciarDBAlunos();
        return true;
    }
}
