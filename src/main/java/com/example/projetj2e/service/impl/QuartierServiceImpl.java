package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Quartier;
import com.example.projetj2e.dao.QuartierDao;
import com.example.projetj2e.service.facade.QuartierService;
import com.example.projetj2e.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuartierServiceImpl implements QuartierService {
    @Autowired
    private QuartierDao quartierDao;
    @Autowired
    private SecteurServiceImpl secteurService;
    @Override
    public Quartier findByCode(String code) {
        return quartierDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return quartierDao.deleteByCode(code);
    }

    @Override
    public Quartier findBySecteurCode(String code) {
        return quartierDao.findBySecteurCode(code) ;
    }

    @Override
    public int save(Quartier quartier) {
        if(quartierDao.findByCode(quartier.getCode())!=null){
            return -1;
        }
        else{
            quartierDao.save(quartier);
            return 1;
        }
    }
}
