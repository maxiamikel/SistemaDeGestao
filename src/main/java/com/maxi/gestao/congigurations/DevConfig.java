package com.maxi.gestao.congigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.maxi.gestao.services.LivroService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private LivroService livroService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	public boolean instanciaDbDev() {
		if (strategy.equals("created")) {
			this.livroService.injectarDB();
		}
		return false;
	}

}
