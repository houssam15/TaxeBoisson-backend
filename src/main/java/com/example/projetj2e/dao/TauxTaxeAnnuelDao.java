package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TauxTaxeAnnuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTaxeAnnuelDao extends JpaRepository<TauxTaxeAnnuel,Long> {
    TauxTaxeAnnuelDao findByReferennce(String reference);
    TauxTaxeAnnuelDao deleteByReference(String reference);

}
