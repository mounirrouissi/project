package com.example.demo.service;

import com.example.demo.models.Commande;
import com.example.demo.repo.CommandeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    private CommandeRepo commandeRepo;

    public CommandeService(CommandeRepo commandeRepo) {
        this.commandeRepo = commandeRepo;
    }

public void addCommande(Commande commande){
        this.commandeRepo.save(commande);
}
public Commande editCommande(Long commandeNumero, Commande commande){
    Commande commandeToEdit = this.commandeRepo.getById(commandeNumero);
        return commandeToEdit.builder().date(commande.getDate())
                       .prixUnitaire(commande.getPrixUnitaire())
                       .etat(commande.getEtat())
                        .build();

}
public List<Commande> getAllCommandes(){
        return this.commandeRepo.findAll();
}

    public Commande getCommandeById(long anyLong) {
        return this.commandeRepo.getById(anyLong);
    }
}
