package com.example.demo;

import java.util.NoSuchElementException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.persistence.model.Professor;
import com.example.demo.persistence.repository.ProfessorRepository;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ProfessorRepository repository) {
		return args -> {
			
			
			Professor professor = new Professor();
			professor.setNome("Breno");
			
			repository.save(professor);
			
			Professor saved = repository.findById(professor.getId())
					.orElseThrow(NoSuchElementException::new);
		};
	}

}
