package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Rue;

public interface RueService {
    Rue findByLocalReference(String reference);
    Rue findByCode(String code);
    int deleteBySecteurCode(String code);
    int save (Rue rue);
}
