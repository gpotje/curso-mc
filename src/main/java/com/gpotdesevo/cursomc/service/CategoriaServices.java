package com.gpotdesevo.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.repository.CategoryRepository;

@Service
public class CategoriaServices {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj =  categoryRepository.findById(id);
		return obj.orElse(null);
		}

}
