package com.example.demo.repo;

import com.example.demo.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepo extends JpaRepository<Commande,String> {
}
