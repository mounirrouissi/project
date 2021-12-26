package com.example.demo.controller;

import com.example.demo.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(ProduitController.class)
class ProduitControllerTest {

    @MockBean
    private CommandeService commandeService;
    @Autowired
    private MockMvc mockMvc;
}