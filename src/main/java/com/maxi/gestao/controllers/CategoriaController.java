package com.maxi.gestao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.gestao.entities.Categoria;
import com.maxi.gestao.services.CategoriaService;

@RestController
@RequestMapping(value="/api/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria cat = service.finfById(id);
		return ResponseEntity.ok().body(cat);
	}
}
