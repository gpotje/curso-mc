package com.gpotdesevo.cursomc.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.service.CategoriaServices;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResouces {
	
	@Autowired
	private CategoriaServices categoriaServices;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		 Categoria obj =  categoriaServices.find(id);
		 return ResponseEntity.ok().body(obj);
	}
	
	
	
	
}
