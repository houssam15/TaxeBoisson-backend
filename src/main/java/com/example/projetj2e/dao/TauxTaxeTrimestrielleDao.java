package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TauxTaxeTrimestrielle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTaxeTrimestrielleDao extends JpaRepository<TauxTaxeTrimestrielle,Long> {
    TauxTaxeTrimestrielle findByRef(String reference);
    TauxTaxeTrimestrielle findByCategorieDeLocalCode(String code);
    int deleteByRef(String reference);
}
