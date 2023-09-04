package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.CategorieDeLocal;

import java.util.Date;

public class TauxTaxeAnnuelDto {
    private Long id;
    private String reference;
    private CategorieDeLocal categorieDeLocal;
    private double PourcentagePremierMoisRetard;
    private double PourcentageAutreMoisRetard;
    private double premierMoisRetard;
    private double autreMoisRetard;
    private Date dateAppMin;
    private Date dateAppMax;

    public CategorieDeLocal getCategorieDeLocal() {
        return categorieDeLocal;
    }

    public void setCategorieDeLocal(CategorieDeLocal categorieDeLocal) {
        this.categorieDeLocal = categorieDeLocal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public double getPremierMoisRetard() {
        return premierMoisRetard;
    }

    public void setPremierMoisRetard(double premierMoisRetard) {
        this.premierMoisRetard = premierMoisRetard;
    }

    public double getAutreMoisRetard() {
        return autreMoisRetard;
    }

    public void setAutreMoisRetard(double autreMoisRetard) {
        this.autreMoisRetard = autreMoisRetard;
    }

    public Date getDateAppMin() {
        return dateAppMin;
    }

    public void setDateAppMin(Date dateAppMin) {
        this.dateAppMin = dateAppMin;
    }

    public Date getDateAppMax() {
        return dateAppMax;
    }

    public void setDateAppMax(Date dateAppMax) {
        this.dateAppMax = dateAppMax;
    }


}
