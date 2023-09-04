package com.example.projetj2e.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TauxTaxeAnnuel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private double pourcentagePremierMoisRetard;
    private double pourcentageAutreMoisRetard;
    private double premierMoisRetard;
    private double autreMoisRetard;
    private Date dateAppMin;
    private Date dateAppMax;
    @ManyToOne
    private CategorieDeLocal categorieDeLocal;

    public CategorieDeLocal getCategorieDeLocal() {
        return categorieDeLocal;
    }

    public void setCategorieDeLocal(CategorieDeLocal categorieDeLocal) {
        this.categorieDeLocal = categorieDeLocal;
    }

    public double getPourcentagePremierMoisRetard() {
        return pourcentagePremierMoisRetard;
    }

    public void setPourcentagePremierMoisRetard(double pourcentagePremierMoisRetard) {
        this.pourcentagePremierMoisRetard = pourcentagePremierMoisRetard;
    }

    public double getPourcentageAutreMoisRetard() {
        return pourcentageAutreMoisRetard;
    }

    public void setPourcentageAutreMoisRetard(double pourcentageAutreMoisRetard) {
        this.pourcentageAutreMoisRetard = pourcentageAutreMoisRetard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}