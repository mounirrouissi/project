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
public Commande editCommande(Commande commande){
    Commande commandeToEdit = this.commandeRepo.getById(commande.getNumero());
        return commande.builder().date(commande.getDate())
                       .prixUnitaire(commande.getPrixUnitaire())
                       .date(commande.getDate())
                        .build();

}
public List<Commande> getAllCommandes(){
        return this.commandeRepo.findAll();
}
}
