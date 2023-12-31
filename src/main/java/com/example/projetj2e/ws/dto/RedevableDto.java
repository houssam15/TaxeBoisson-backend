package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.CategorieRedevable;
import jakarta.persistence.ManyToOne;

public class RedevableDto {


    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    @ManyToOne
    private CategorieRedevable categorieRedevable;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public CategorieRedevable getCategorieRedevable() {
        return categorieRedevable;
    }

    public void setCategorieRedevable(CategorieRedevable categorieRedevable) {
        this.categorieRedevable = categorieRedevable;
    }
}
