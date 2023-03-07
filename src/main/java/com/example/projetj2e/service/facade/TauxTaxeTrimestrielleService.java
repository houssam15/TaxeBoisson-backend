package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.TauxTaxeTrimestrielle;
import com.example.projetj2e.bean.TaxeBoissonTrimestrielle;
import jakarta.transaction.Transactional;

import java.util.Date;
import java.util.List;

public interface TauxTaxeTrimestrielleService {
    TauxTaxeTrimestrielle findByRef(String reference);
    @Transactional
    int deleteByRef(String reference);
    List<TauxTaxeTrimestrielle> findAll();
    int save(TaxeBoissonTrimestrielle entity);
    TauxTaxeTrimestrielle findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(String code, Date date1, Date date2);
    int save(TauxTaxeTrimestrielle entity);
}
