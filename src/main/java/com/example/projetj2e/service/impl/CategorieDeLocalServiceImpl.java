package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.dao.CategorieDeLocalDao;
import com.example.projetj2e.service.facade.CategorieDeLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieDeLocalServiceImpl implements CategorieDeLocalService {
    @Autowired
    private CategorieDeLocalDao categorieDeLocalDao;

    public CategorieDeLocal findByCode(String code) {
        return categorieDeLocalDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return categorieDeLocalDao.deleteByCode(code);
    }

    public List<CategorieDeLocal> findAll() {
        return categorieDeLocalDao.findAll();
    }

    public  int save(CategorieDeLocal entity) {
        categorieDeLocalDao.save(entity);
        return 1;
    }
}
