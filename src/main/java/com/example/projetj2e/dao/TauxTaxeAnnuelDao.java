package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TauxTaxeAnnuel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface TauxTaxeAnnuelDao extends JpaRepository<TauxTaxeAnnuel,Long> {
    TauxTaxeAnnuel findByReference(String reference);
    TauxTaxeAnnuel findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(String code, Date date,Date date2);
    int deleteByReference(String reference);
}