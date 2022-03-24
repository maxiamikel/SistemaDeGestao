package com.maxi.gestao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxi.gestao.dominios.Categoria;
import com.maxi.gestao.dominios.Livro;
import com.maxi.gestao.repositories.CategoriaRepository;
import com.maxi.gestao.repositories.LivroRepository;

@SpringBootApplication
public class GestaoApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository catRep;

	@Autowired
	private LivroRepository livRep;

	public static void main(String[] args) {

		SpringApplication.run(GestaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat = new Categoria(null, "Informatica", "Introduçao a informatica básica");
		Livro li = new Livro(null, "Informática avanzado", "Amikel Maxi Celestin",
				"La info está basada em grandes avançoa da tecnologia", cat);
		
		Livro li1 = new Livro(null, "Informática Básica", "Myrlande Louissaint De Maxi",
				"La tecnologia de la información", cat);
		cat.getLivros().addAll(Arrays.asList(li));
		this.catRep.saveAll(Arrays.asList(cat));
		this.livRep.saveAll(Arrays.asList(li, li1));

	}

}
