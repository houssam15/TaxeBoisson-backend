package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Quartier;
import com.example.projetj2e.dao.QuartierDao;
import com.example.projetj2e.service.facade.QuartierService;
import com.example.projetj2e.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierServiceImpl implements QuartierService {
    @Autowired
    private QuartierDao quartierDao;
    @Autowired
    private SecteurServiceImpl secteurService;

    public List<Quartier> findAll() {
        return quartierDao.findAll();
    }

    @Override
    public Quartier findByCode(String code) {
        return quartierDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return quartierDao.deleteByCode(code);
    }
    @Override
    public int save(Quartier quartier) {
        if(findByCode(quartier.getCode())!=null){
            return -1;
        }else if(quartier.getSecteur()==null){
            return -2;
        } else if(secteurService.findByCode(quartier.getSecteur().getCode())==null){
            return -3;
        }
        else{
            quartier.setSecteur(secteurService.findByCode(quartier.getSecteur().getCode()));
            quartierDao.save(quartier);
            return 1;
        }
    }
}
