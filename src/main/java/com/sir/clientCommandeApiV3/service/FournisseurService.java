package com.sir.clientCommandeApiV3.service;

import com.sir.clientCommandeApiV3.bean.Fournisseur;

public interface FournisseurService{
    public int creerFournisseur(Fournisseur client);
    public Fournisseur chercherFournisseur(Long cni);
}
