package com.example.demo.service;

import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.repo.ClientRepo;
import com.example.demo.repo.CommandeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
class ClientServiceTest {

    @Autowired
    private ClientRepo Repo;
    @Autowired
    private ClientService service;

    @Test
    void addClient() {
        //Given
        Client savedClient = this.Repo.save(new Client(12L,"123","","",null,"","",null,"","","","",null));
        //When
        Client clientById = this.service.getClientById(12L);
        //Then
        assertThat(clientById.getCode()).isEqualTo("123");
    }


}