package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Rue;

import java.util.List;

public interface RueService {
    Rue findByCode(String code);
    int deleteByQuartierCode(String code);
    int save (Rue rue);
    List<Rue> findAll();
}
