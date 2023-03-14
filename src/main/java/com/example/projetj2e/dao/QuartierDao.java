package com.example.projetj2e.dao;

import com.example.projetj2e.bean.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartierDao extends JpaRepository<Quartier,Long> {
    Quartier findByCode(String code);
    int deleteByCode(String code);
    Quartier  findBySecteurCode(String code);

}
