package com.gpotdesevo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.repository.CategoryRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 =  new Categoria(null, "Informática");
		Categoria c2 =  new Categoria(null, "Escritório");
		
		categoryRepository.saveAll(Arrays.asList(c1,c2));
	 
	}

}
