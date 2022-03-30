package com.maxi.gestao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.gestao.entities.Categoria;
import com.maxi.gestao.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria finfById(Long id){
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElse(null);
	}

}
