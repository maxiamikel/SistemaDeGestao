package com.maxi.gestao.services;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxi.gestao.dominios.Categoria;
import com.maxi.gestao.dominios.Livro;
import com.maxi.gestao.repositories.CategoriaRepository;
import com.maxi.gestao.repositories.LivroRepository;

@Service
@Transactional
public class LivroService {
	@Autowired
	private CategoriaRepository catRep;

	@Autowired
	private LivroRepository livRep;

	public void injectarDB() {

		Categoria cat = new Categoria(null, "Informatica", "Introduçao a informatica básica");
		Categoria cat1 = new Categoria(null, "Historia", "Historia da Computação");

		Livro li = new Livro(null, "Informática avanzado", "Amikel Maxi Celestin",
				"La info está basada em grandes avançoa da tecnologia", cat);

		Livro li1 = new Livro(null, "Informática Básica", "Myrlande Louissaint De Maxi",
				"La tecnologia de la información", cat);
		Livro li2 = new Livro(null, "La deccubierta de las grandes ideas de la tecnologia", "Atalande Louissaint",
				"Whitelabel Error Page\n"
						+ "This application has no explicit mapping for /error, so you are seeing this as a fallback.\n"
						+ "\n" + "Wed Mar 23 16:10:25 BRT 2022\n"
						+ "There was an unexpected error (type=Not Found, status=404).\n" + "No message available",
				cat1);

		cat.getLivros().addAll(Arrays.asList(li));
		this.catRep.saveAll(Arrays.asList(cat, cat1));
		this.livRep.saveAll(Arrays.asList(li, li1, li2));
	}

}
