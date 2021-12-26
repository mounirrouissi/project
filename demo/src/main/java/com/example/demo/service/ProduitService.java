package com.example.demo.service;

import com.example.demo.models.Produit;
import com.example.demo.repo.ProduitRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private ProduitRepo produitRepo;

    public ProduitService(ProduitRepo produitRepo) {
        this.produitRepo = produitRepo;
    }

public void addProduit(Produit produit){
        this.produitRepo.save(produit);
}
public Produit editProduit(Long numero, Produit produit){
/*    Produit produitToEdit = this.produitRepo.getById(produit.getNumero());
        return produit.builder().date(produit.getDate())
                       .prixUnitaire(produit.getPrixUnitaire())
                       .date(produit.getDate())
                        .build();*/

    return produit;
}
public List<Produit> getAllProduits(){
        return this.produitRepo.findAll();
}

    public Produit getProduitById(Long id) {
        return this.produitRepo.getById(id);
    }
}
