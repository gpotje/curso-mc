package com.gpotdesevo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.entities.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}
