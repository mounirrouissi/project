package com.example.demo;

import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.models.LignCommande;
import com.example.demo.repo.CommandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
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
