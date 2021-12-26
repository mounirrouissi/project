package com.example.demo.repo;

import com.example.demo.models.Commande;
import com.example.demo.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,String> {
}
