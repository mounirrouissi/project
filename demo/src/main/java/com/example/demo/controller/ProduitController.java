package com.example.demo.controller;

import com.example.demo.models.Produit;
import com.example.demo.service.ProduitService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
@Api(value="onlinestore", description="Operations pertaining to produits in Online Store")
public class ProduitController {
    private ProduitService service;

    public ProduitController(ProduitService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void addProduit(@RequestBody Produit commande){
        this.service.addProduit(commande);
    }
    @PutMapping("{id}")
    public Produit editProduit(@PathVariable(name = "id") Long id, @RequestBody Produit commande){
        return this.service.editProduit(id,commande);

    }
    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return this.service.getAllProduits();
    }
    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id){
        return this.service.getProduitById(id);
    }
    
    
}
