package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String nom;
    private String prenom;
    private LocalDate dateNaisance;
    private String address;
    private String ville;
    private Long codePostal;
    private String tel;
    private String fax;
    private String gsm;
    private String email;
    @OneToMany
    @JoinColumn(name = "categorie_id")
    private List<Commande> commandes;
}
