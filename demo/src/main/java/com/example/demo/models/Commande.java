package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity

public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numero;
    private LocalDate date;
    private BigDecimal prixUnitaire;
    private Long etat;
    @OneToMany(mappedBy = "commande")
    private List<LignCommande> lignCommande;
    @ManyToOne
    private Client client;
}
