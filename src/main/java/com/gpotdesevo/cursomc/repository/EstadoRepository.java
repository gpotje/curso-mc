package com.gpotdesevo.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.entities.Estado;

public interface EstadoRepository  extends JpaRepository<Estado, Integer>{

}
