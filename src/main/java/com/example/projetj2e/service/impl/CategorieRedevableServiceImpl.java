package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.CategorieRedevable;
import com.example.projetj2e.dao.CategorieRedevableDao;
import com.example.projetj2e.service.facade.CategorieRedevableService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieRedevableServiceImpl implements CategorieRedevableService {
@Autowired
private CategorieRedevableDao categorieRedevableDao;

    public int save(CategorieRedevable entity) {
        if(findByCode(entity.getCode())!=null){
            return -1;
        }
         categorieRedevableDao.save(entity);
        return 1;
    }

    @Override
    public CategorieRedevable findByCode(String code) {
        return categorieRedevableDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return categorieRedevableDao.deleteByCode(code);
    }
}
