package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.TaxeBoissonAnnuel;

import java.util.List;

public interface TaxeBoissonAnnuelService {
    TaxeBoissonAnnuel findByReference(String reference);
    int deleteByReference(String reference);
    List<TaxeBoissonAnnuel> findAll();
    int save(TaxeBoissonAnnuel entity);


}