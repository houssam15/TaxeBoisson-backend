package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.Secteur;
import jakarta.persistence.ManyToOne;

public class QuartierDto {
    private Long id;
    private String libelle;
    private String code;
    private Secteur secteur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
}
