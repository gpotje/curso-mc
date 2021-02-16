package com.gpotdesevo.cursomc.resouces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gpotdesevo.cursomc.entities.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResouces {
	
	@RequestMapping(value = "all")
	@GetMapping
	public List<Categoria> listar(){
		
		Categoria c1 =  new Categoria(1, "item1");
		Categoria c2 =  new Categoria(1, "item2");
		
		List<Categoria> list =  new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		return list;
		
	}

}
