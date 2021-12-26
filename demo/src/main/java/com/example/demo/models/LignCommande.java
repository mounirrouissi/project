package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
@Entity
public class LignCommande {
    private Long quantite;
    private BigDecimal prixUnitaire;
    private BigDecimal prixTotal;
    private Long etat;
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

}
