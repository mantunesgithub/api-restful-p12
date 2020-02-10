package br.com.udemy.p12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class P12Application {

	@Value("${paginacao.qtd_por_pagina}")
	private int	qtdPorPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(P12Application.class, args);
	}
	@Bean
	public	CommandLineRunner comandLineRunner() {
		return args -> {
			System.out.println("### Qtde de elementos por pagina = " + this.qtdPorPagina);
		};
	}
}
