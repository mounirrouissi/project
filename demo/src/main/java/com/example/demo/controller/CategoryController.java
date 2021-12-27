package com.example.demo.controller;

import com.example.demo.models.Categorie;
import com.example.demo.service.CategorieService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
@Api(value="onlinestore", description="Operations pertaining to catorgies in Online Store")

public class CategoryController {
    private CategorieService categoryService;

    public CategoryController(CategorieService categoryService) {
        this.categoryService = categoryService;
    }
@PostMapping
    public void addCategorie(@RequestBody Categorie categorie){
        this.categoryService.addCategorie(categorie);
    }
  @GetMapping
    public List<Categorie> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

}
