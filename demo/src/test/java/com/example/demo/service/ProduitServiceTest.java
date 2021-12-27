package com.example.demo.service;

import com.example.demo.models.Commande;
import com.example.demo.models.Produit;
import com.example.demo.repo.CommandeRepo;
import com.example.demo.repo.ProduitRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
class ProduitServiceTest {

    @Autowired
    private ProduitRepo Repo;
    @Autowired
    private ProduitService service;

    @Test
    void addProduit() {
        //Given
        Produit savedProduit = this.Repo.save(new Produit(123L,"12345","","","",null,null,null,null));
        //When
        Produit produitById = this.service.getProduitById(123L);
        //Then
        assertThat(produitById.getModele()).isEqualTo("12345");
    }


}