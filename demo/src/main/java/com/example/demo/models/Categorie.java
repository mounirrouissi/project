package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Categorie {
    private String code;
    private String libelle;
@OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}
