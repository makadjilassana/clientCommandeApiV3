package com.sir.clientCommandeApiV3.serviceImpl;

import com.sir.clientCommandeApiV3.bean.Fournisseur;
import com.sir.clientCommandeApiV3.dao.FournisseurDao;
import com.sir.clientCommandeApiV3.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurServiceImpl implements FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    @Override
    public int creerFournisseur(Fournisseur fournisseur) {

        fournisseurDao.save(fournisseur);
        return 1;
    }

    @Override
    public Fournisseur chercherFournisseur(Long cni) {
        Fournisseur c= fournisseurDao.findByCni(cni);
        return c;
    }

}
