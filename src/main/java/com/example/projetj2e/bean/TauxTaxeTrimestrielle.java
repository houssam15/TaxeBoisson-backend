package com.example.projetj2e.bean;

import jakarta.persistence.*;

@Entity
public class TauxTaxeTrimestrielle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ref;
    private int dateAppMin;
    private int dateAppMax;
@ManyToOne
    private CategorieDeLocal categorieDeLocal;
    private double pourcentage;
    private double pourcentageRetardPremierMois;
    private double pourcentageRetardAutreMois;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getDateAppMin() {
        return dateAppMin;
    }

    public void setDateAppMin(int dateAppMin) {
        this.dateAppMin = dateAppMin;
    }

    public int getDateAppMax() {
        return dateAppMax;
    }

    public void setDateAppMax(int dateAppMax) {
        this.dateAppMax = dateAppMax;
    }

    public CategorieDeLocal getCategorieDeLocal() {
        return categorieDeLocal;
    }

    public void setCategorieDeLocal(CategorieDeLocal categorieDeLocal) {
        this.categorieDeLocal = categorieDeLocal;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }



    public double getPourcentageRetardPremierMois() {
        return pourcentageRetardPremierMois;
    }

    public void setPourcentageRetardPremierMois(double pourcentageRetardPremierMois) {
        this.pourcentageRetardPremierMois = pourcentageRetardPremierMois;
    }

    public double getPourcentageRetardAutreMois() {
        return pourcentageRetardAutreMois;
    }

    public void setPourcentageRetardAutreMois(double pourcentageRetardAutreMois) {
        this.pourcentageRetardAutreMois = pourcentageRetardAutreMois;
    }
}
