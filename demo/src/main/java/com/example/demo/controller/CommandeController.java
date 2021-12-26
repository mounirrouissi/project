package com.example.demo.controller;

import com.example.demo.models.Commande;
import com.example.demo.repo.CommandeRepo;
import com.example.demo.service.CommandeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/v1/commandes/")
@AllArgsConstructor
@NoArgsConstructor
public class CommandeController {
private CommandeService commandeService;

@PostMapping
    public void addCommande(@RequestBody Commande commande){
        this.commandeService.addCommande(commande);
    }
    @PutMapping("{numero}")
    public Commande editCommande(@PathVariable(name = "numero") Long numero,@RequestBody Commande commande){
        return this.commandeService.editCommande(numero,commande);

    }
    @GetMapping("")
    public List<Commande> getAllCommandes(){
        return this.commandeService.getAllCommandes();
    }

}
