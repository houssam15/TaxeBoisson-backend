package com.example.projetj2e.dao;

import com.example.projetj2e.bean.CategorieRedevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRedevableDao extends JpaRepository<com.example.projetj2e.bean.CategorieRedevable,Long> {
    CategorieRedevable findByCode(String code);
    int deleteByCode(String code);
}
