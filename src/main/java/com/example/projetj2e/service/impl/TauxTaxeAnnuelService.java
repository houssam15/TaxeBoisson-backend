package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.bean.TaxeBoissonAnnuel;
import com.example.projetj2e.service.impl.CategorieDeLocalServiceImpl;
import com.example.projetj2e.bean.TauxTaxeAnnuel;
import com.example.projetj2e.dao.TauxTaxeAnnuelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class TauxTaxeAnnuelService {
    @Autowired
    private CategorieDeLocalServiceImpl categorieDeLocalServiceImpl;

    public TauxTaxeAnnuelDao findByReference(String reference) {
        return tauxTaxeAnnuelDao.findByReferennce(reference);
    }
    @Autowired
    TauxTaxeAnnuelDao tauxTaxeAnnuelDao;
    public int save(TauxTaxeAnnuel tauxTaxeAnnuel){
        if (findByReference(tauxTaxeAnnuel.getRef()) != null) {
            return -1;
        } else if (tauxTaxeAnnuel.getDateAppMin().compareTo(tauxTaxeAnnuel.getDateAppMax())>0 ) {
            return -2;
        } else {
            tauxTaxeAnnuelDao.save(tauxTaxeAnnuel);
            return 1;
        }



        /*public double taux(String ref, int annee){
            double taux1=0.00;
            // methode mn taxeBoisson annuel
            taux1= findByRefAndAnnee( ref, annee);

            return taux1;

        }*/






    }




}

