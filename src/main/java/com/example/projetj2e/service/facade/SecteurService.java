package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Secteur;

import java.util.List;

public interface SecteurService {
    Secteur findByCode(String code);

    int deleteByCode(String code);


    List<Secteur> findAll();
    int save(Secteur secteur);

}
