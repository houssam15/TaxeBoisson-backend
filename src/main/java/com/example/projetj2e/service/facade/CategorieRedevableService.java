package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.CategorieRedevable;
import jakarta.transaction.Transactional;

public interface CategorieRedevableService {
    CategorieRedevable findByCode(String code);
    @Transactional
    int deleteByCode(String code);
    public int save(CategorieRedevable entity);

}
