package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.bean.Rue;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class LocalDto {
    private Long id;
    private String reference;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private CategorieDeLocal categorieDeLocal;
    private Date dateAjoutDeLocal;

    private Date dernierDatePayTrimestriel;
    private Date dernierDatePayAnnuel;
    @ManyToOne
    private Rue rue;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String ref) {
        this.reference = ref;
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

    public Date getDernierDatePayTrimestriel() {
        return dernierDatePayTrimestriel;
    }

    public void setDernierDatePayTrimestriel(Date dernierDatePayTrimestriel) {
        this.dernierDatePayTrimestriel = dernierDatePayTrimestriel;
    }

    public Date getDernierDatePayAnnuel() {
        return dernierDatePayAnnuel;
    }

    public void setDernierDatePayAnnuel(Date dernierDatePayAnnuel) {
        this.dernierDatePayAnnuel = dernierDatePayAnnuel;
    }

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public Date getDateAjoutDeLocal() {
        return dateAjoutDeLocal;
    }

    public void setDateAjoutDeLocal(Date dateAjoutDeLocal) {
        this.dateAjoutDeLocal = dateAjoutDeLocal;
    }
}
