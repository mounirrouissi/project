package com.example.demo.service;

import com.example.demo.models.Commande;
import com.example.demo.repo.CommandeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
class CommandeServiceTest {

    @Autowired
    private CommandeRepo Repo;
    @Autowired
    private CommandeService service;

    @Test
    void addCommande() {
        //Given
        Commande savedCommande = this.Repo.save(new Commande(12L,"123"));
        //When
        Commande commandeById = this.service.getCommandeById(12L);
        //Then
        assertThat(commandeById.getNumero()).isEqualTo("123");
    }


}