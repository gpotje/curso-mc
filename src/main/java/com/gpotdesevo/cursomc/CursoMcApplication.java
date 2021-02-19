package com.gpotdesevo.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gpotdesevo.cursomc.entities.Categoria;
import com.gpotdesevo.cursomc.entities.Cidade;
import com.gpotdesevo.cursomc.entities.Estado;
import com.gpotdesevo.cursomc.entities.Produto;
import com.gpotdesevo.cursomc.repository.CategoryRepository;
import com.gpotdesevo.cursomc.repository.CidadeRepository;
import com.gpotdesevo.cursomc.repository.EstadoRepository;
import com.gpotdesevo.cursomc.repository.ProdutoRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private  ProdutoRepository produtoRepository;
	
	@Autowired
	private  CidadeRepository cidadeRepository;
	
	@Autowired
	private  EstadoRepository estadoRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 =  new Categoria(null, "Informática");
		Categoria c2 =  new Categoria(null, "Escritório");
		
		categoryRepository.saveAll(Arrays.asList(c1,c2));
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "mouse", 80.00);
		
		c1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		c2.getProdutos().addAll(Arrays.asList(p2,p3));
		
		
		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1,c2));
		p3.getCategorias().addAll(Arrays.asList(c1));
		
		
		categoryRepository.saveAll(Arrays.asList(c1,c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
		
		Estado est1 =  new Estado(null, "Minas gerais");
		Estado est2 =  new Estado(null, "São Paulo");
		
		Cidade cit1 = new Cidade(null, "Uberlandia", est1);
		Cidade cit2 = new Cidade(null, "São Paulo", est1);
		Cidade cit3 = new Cidade(null, "Campinas", est1);
		
		
		est1.getCidades().addAll(Arrays.asList(cit1));
		est2.getCidades().addAll(Arrays.asList(cit2,cit3));
		 
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(cit1,cit2,cit3));
		 
		 
	 
	}

}
