package com.sir.clientCommandeApiV3.rest;

import com.sir.clientCommandeApiV3.bean.Fournisseur;
import com.sir.clientCommandeApiV3.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/Commande2ApiV3/fournisseur")
public class FournisseurRest {
    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping("/")
    public int creerClient(@RequestBody Fournisseur fournisseur){
        return fournisseurService.creerFournisseur(fournisseur);
    }

    @GetMapping("/cni/{cni}")
    public Fournisseur trouverFournisseur(@PathVariable("cni") Long cni)
    {
        return fournisseurService.chercherFournisseur(cni);
    }

}
