package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Produit {
    private String code;
    private String marque;
    private String modele;
    private String caracteritique;
    private BigDecimal prixUnitaire;
    private Long quantite;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
    @OneToMany(mappedBy = "produit")
    private List<LignCommande> lignCommandes;
}
