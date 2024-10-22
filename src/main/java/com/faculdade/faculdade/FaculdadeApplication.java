package com.faculdade.faculdade;
import com.faculdade.faculdade.entities.Alunos;
import com.faculdade.faculdade.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FaculdadeApplication {//implements CommandLineRunner {
	@Autowired
	private AlunosRepository alunosRepository;

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
	}
}
