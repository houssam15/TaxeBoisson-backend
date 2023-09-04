package com.example.projetj2e.bean;

import jakarta.persistence.*;

@Entity
public class TaxeBoissonAnnuel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @ManyToOne
    private TauxTaxeAnnuel tauxTaxeAnnuel;
    @ManyToOne
    private Local local;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne

    private CategorieDeLocal categorieDeLocal;
    private int moisRetard;
    private double chifrreAffaireAnnuel;
    private double montantTotal;
    private double montantRetardPremierMois;
    private double montantRetardAutreMois;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TauxTaxeAnnuel getTauxTaxeAnnuel() {
        return tauxTaxeAnnuel;
    }

    public CategorieDeLocal getCategorieDeLocal() {
        return categorieDeLocal;
    }

    public void setCategorieDeLocal(CategorieDeLocal categorieDeLocal) {
        this.categorieDeLocal = categorieDeLocal;
    }

    public void setTauxTaxeAnnuel(TauxTaxeAnnuel tauxTaxeAnnuel) {
        this.tauxTaxeAnnuel = tauxTaxeAnnuel;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }



    public int getMoisRetard() {
        return moisRetard;
    }

    public void setMoisRetard(int moisRetard) {
        this.moisRetard = moisRetard;
    }


    public double getMontantTotal() {
        return montantTotal;
    }

    public double getChifrreAffaireAnnuel() {
        return chifrreAffaireAnnuel;
    }

    public void setChifrreAffaireAnnuel(double chifrreAffaireAnnuel) {
        this.chifrreAffaireAnnuel = chifrreAffaireAnnuel;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public double getMontantRetardPremierMois() {
        return montantRetardPremierMois;
    }

    public void setMontantRetardPremierMois(double montantRetardPremierMois) {
        this.montantRetardPremierMois = montantRetardPremierMois;
    }

    public double getMontantRetardAutreMois() {
        return montantRetardAutreMois;
    }

    public void setMontantRetardAutreMois(double montantRetardAutreMois) {
        this.montantRetardAutreMois = montantRetardAutreMois;
    }

}