package com.gpotdesevo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotdesevo.cursomc.entities.Categoria;

public interface CategoryRepository  extends JpaRepository<Categoria, Integer>{

}
