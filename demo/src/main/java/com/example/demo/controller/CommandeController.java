package com.example.demo.controller;

import com.example.demo.models.Commande;
import com.example.demo.service.CommandeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
@Api(value="onlinestore", description="Operations pertaining to commande in Online Store")
public class CommandeController {
    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @PostMapping("/add")
    public void addCommande(@RequestBody Commande commande){
        this.commandeService.addCommande(commande);
    }
    @PutMapping("{id}")
    public Commande editCommande(@PathVariable(name = "id") Long id,@RequestBody Commande commande){
        return this.commandeService.editCommande(id,commande);

    }
    @GetMapping("/all")
    public List<Commande> getAllCommandes(){
        return this.commandeService.getAllCommandes();
    }
   @GetMapping("/{id}")
    public Commande getCommandeById(@PathVariable Long id){
        return this.commandeService.getCommandeById(id);
    }

}
