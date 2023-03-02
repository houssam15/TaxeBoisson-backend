package com.example.projetj2e.dao;

import com.example.projetj2e.bean.TaxeBoissonTrimestrielle;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeBoissonTrimestrielleDao extends JpaRepository<TaxeBoissonTrimestrielle,Long> {
    TaxeBoissonTrimestrielle findByReference(String reference);
    @Transactional
    int deleteByReference(String reference);
}

