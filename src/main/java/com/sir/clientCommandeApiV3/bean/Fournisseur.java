/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.clientCommandeApiV3.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Makadji
 */
@Entity
public class Fournisseur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long cni;
    private String nom;
    private String prenom;

    public Fournisseur() {
    }

    public Long getCni() {
        return cni;
    }

    public void setCni(Long cni) {
        this.cni = cni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cni != null ? cni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fournisseur)) {
            return false;
        }
        Fournisseur other = (Fournisseur) object;
        if ((this.cni == null && other.cni != null) || (this.cni != null && !this.cni.equals(other.cni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.clientCommandeApiV3.bean.Fournisseur[ id=" + cni + " ]";
    }
    
}
