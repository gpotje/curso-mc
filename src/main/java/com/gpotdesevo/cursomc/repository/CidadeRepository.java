package com.gpotdesevo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.entities.Cidade;

public interface CidadeRepository  extends JpaRepository<Cidade, Integer>{

}
