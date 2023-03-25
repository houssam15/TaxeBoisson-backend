package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Quartier;

import java.util.List;

public interface QuartierService {
    Quartier findByCode(String code);
    int deleteByCode(String code);
    int save(Quartier quartier);
     List<Quartier> findAll();

}
