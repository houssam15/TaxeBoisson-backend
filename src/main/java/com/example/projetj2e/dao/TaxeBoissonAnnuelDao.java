package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TaxeBoissonAnnuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeBoissonAnnuelDao extends JpaRepository<TaxeBoissonAnnuel,Long> {
    TaxeBoissonAnnuel findByReference(String reference);
    int deleteByReference(String reference);
}