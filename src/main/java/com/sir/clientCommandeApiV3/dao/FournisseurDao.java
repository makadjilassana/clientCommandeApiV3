package com.sir.clientCommandeApiV3.dao;

import com.sir.clientCommandeApiV3.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
  public Fournisseur findByCni(Long cni);
}
