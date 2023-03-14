package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Secteur;
import com.example.projetj2e.dao.SecteurDao;
import com.example.projetj2e.service.facade.QuartierService;
import com.example.projetj2e.service.facade.RueService;
import com.example.projetj2e.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Autowired

    private SecteurDao secteurDao;
   @Autowired
   private QuartierService quartierService;
   @Autowired
   private RueServiceImpl rueService;
    @Override
    public Secteur findByCode(String code) {
        return secteurDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        int resultatRue=rueService.deleteBySecteurCode(code);
        int resultatSecteur=secteurDao.deleteByCode(code);
        return resultatSecteur+resultatRue;
    }

    @Override
    public Secteur findByRueCode(String code) {
        return secteurDao.findByRueCode(code);
    }

    @Override
    public List<Secteur> findAll() {
        return secteurDao.findAll();
    }

    @Override
    public int save(Secteur secteur) {
        if(findByCode(secteur.getCode())!=null){
            return -1;
        } else{
            secteurDao.save(secteur);
            return 1;
        }

    }
}
