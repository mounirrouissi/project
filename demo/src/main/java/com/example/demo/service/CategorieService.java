package com.example.demo.service;

import com.example.demo.models.Categorie;
import com.example.demo.repo.CategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieService {
    private CategoryRepo categoryRepo;

    public void addCategorie(Categorie category) {
        this.categoryRepo.save(category);
    }

    public List<Categorie> getAllCategories() {
        return this.categoryRepo.findAll();
    }
}
