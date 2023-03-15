package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Rue;

public interface RueService {
    Rue findByCode(String code);
    int deleteByQuartierCode(String code);
    int save (Rue rue);
}
