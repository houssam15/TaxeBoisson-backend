package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.TauxTaxeAnnuel;

import java.util.Date;
import java.util.List;

public interface TauxTaxeAnnuelService {
    TauxTaxeAnnuel findByReference(String reference);
    TauxTaxeAnnuel findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(String code, Date date);
    int deleteByReference(String reference);
    int save(TauxTaxeAnnuel tauxTaxeAnnuel);
    List<TauxTaxeAnnuel> findAll();
}