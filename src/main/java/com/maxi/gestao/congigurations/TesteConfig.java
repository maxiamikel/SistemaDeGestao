package com.maxi.gestao.congigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.maxi.gestao.services.LivroService;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private LivroService livroService;

	@Bean
	public void instanciarDB() {
		this.livroService.injectarDB();
	}

}
