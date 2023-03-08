package com.example.projetj2e.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TauxTaxeAnnuel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Date dateAppMin;
    private Date dateAppMax;
    @ManyToOne
    private CategorieDeLocal categorieDeLocal;
    private double pourcentagePremierMoisRetard;
    private double pourcentageAutreMoisRetard;


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
}
