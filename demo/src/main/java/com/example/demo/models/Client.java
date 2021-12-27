package com.example.demo.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated product ID")
    private  Long id;
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
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
}
