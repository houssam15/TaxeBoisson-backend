package com.example.projetj2e.dao;

import com.example.projetj2e.bean.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface SecteurDao extends JpaRepository<Secteur,Long> {
    Secteur findByCode(String code);

    int deleteByCode(String code);
    Secteur findByRueCode(String code);

    List<Secteur> findAll();
}
