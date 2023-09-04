package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.bean.TauxTaxeAnnuel;


public class TaxeBoisssonAnnuelDto {
    private Long id;
    private String reference;
    private TauxTaxeAnnuel tauxTaxeAnnuel;
    private Local local;
    private Redevable redevable;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public TauxTaxeAnnuel getTauxTaxeAnnuel() {
        return tauxTaxeAnnuel;
    }

    public void setTauxTaxeAnnuel(TauxTaxeAnnuel tauxTaxeAnnuel) {
        this.tauxTaxeAnnuel = tauxTaxeAnnuel;
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

    public CategorieDeLocal getCategorieDeLocal() {
        return categorieDeLocal;
    }

    public void setCategorieDeLocal(CategorieDeLocal categorieDeLocal) {
        this.categorieDeLocal = categorieDeLocal;
    }

    public int getMoisRetard() {
        return moisRetard;
    }

    public void setMoisRetard(int moisRetard) {
        this.moisRetard = moisRetard;
    }

    public double getChifrreAffaireAnnuel() {
        return chifrreAffaireAnnuel;
    }

    public void setChifrreAffaireAnnuel(double chifrreAffaireAnnuel) {
        this.chifrreAffaireAnnuel = chifrreAffaireAnnuel;
    }

    public double getMontantTotal() {
        return montantTotal;
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