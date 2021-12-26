package com.example.demo.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.example.demo.models.Commande;
import com.example.demo.service.CommandeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(CommandeController.class)
class CommandeControllerTest {

    @MockBean
    private CommandeService commandeService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCommande_ForSavedCommande_Returned() throws Exception
    {

    }
}