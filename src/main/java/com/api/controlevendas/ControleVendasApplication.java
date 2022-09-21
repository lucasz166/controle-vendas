package com.api.controlevendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControleVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleVendasApplication.class, args);}


		@GetMapping("/")
		public String index(){
		return "Sistema de controle de vendas!x	";
	}

}
