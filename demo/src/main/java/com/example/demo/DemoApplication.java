package com.example.demo;

import com.example.demo.controller.CommandeController;
import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.models.LignCommande;
import com.example.demo.repo.CommandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.AuthorizationScopeBuilder;
import springfox.documentation.builders.ImplicitGrantBuilder;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
/*@EnableSwagger2 //Enable swagger 2.0 spec
@EnableOpenApi //Enable open api 3.0.3 spec*/
public class DemoApplication  implements CommandLineRunner{

@Autowired
	CommandeRepo commandeRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ArrayList list=new ArrayList<LignCommande>();
		this.commandeRepo.save(new Commande("123"));
		this.commandeRepo.save(new Commande("124"));
		this.commandeRepo.save(new Commande("125"));
	}





}
