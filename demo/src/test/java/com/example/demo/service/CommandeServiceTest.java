package com.example.demo.service;

import com.example.demo.repo.CommandeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

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
    }

    @Test
    void editCommande() {
    }

    @Test
    void getAllCommandes() {
    }
}