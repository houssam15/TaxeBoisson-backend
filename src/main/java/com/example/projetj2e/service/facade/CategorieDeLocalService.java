package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.dao.CategorieDeLocalDao;
import jakarta.transaction.Transactional;

import java.util.List;

public interface CategorieDeLocalService {

    public CategorieDeLocal findByCode(String code);
    @Transactional
    public int deleteByCode(String code);

    public List<CategorieDeLocal> findAll();

    public  int save(CategorieDeLocal entity);

}
