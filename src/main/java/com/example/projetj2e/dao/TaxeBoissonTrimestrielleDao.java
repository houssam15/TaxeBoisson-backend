package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TaxeBoissonTrimestrielle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeBoissonTrimestrielleDao extends JpaRepository<TaxeBoissonTrimestrielle,Long> {
    TaxeBoissonTrimestrielle findByReference(String reference);
    int deleteByReference(String reference);
}

