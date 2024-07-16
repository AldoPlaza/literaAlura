package com.aluracursos.lireralura;

import com.aluracursos.lireralura.Repository.LibrosRepository;
import com.aluracursos.lireralura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LireraluraApplication implements CommandLineRunner {


	@Autowired
	private LibrosRepository repository;
	public static void main(String[] args) {

		SpringApplication.run(LireraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal =new Principal(repository);
		principal.muestraElMenu();
	}
}
