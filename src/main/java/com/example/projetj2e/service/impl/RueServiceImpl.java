package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Rue;
import com.example.projetj2e.dao.RueDao;
import com.example.projetj2e.service.impl.LocalServiceImpl;
import com.example.projetj2e.service.impl.QuartierServiceImpl;
import com.example.projetj2e.service.facade.RueService;
import com.example.projetj2e.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RueServiceImpl implements RueService {
    @Autowired
    private RueDao rueDao;
    @Autowired
    private SecteurService secteurService;
    // private Local local;
    @Override
    public Rue findByLocalReference(String reference) {
        return rueDao.findByLocalReference(reference);
    }

    @Override
    public Rue findByCode(String code) {
        return rueDao.findByCode(code);
    }

    @Override
   public int deleteBySecteurCode(String code){return rueDao.deleteBySecteurCode(code);}

    @Override
    public int save(Rue rue) {
        if (secteurService.findByCode(rue.getSecteur().getCode())==null){
            return -1;
        }

       else{
          //  if(rueDao.findByCode(rue.getCode())!=null){

          //  }
            rueDao.save(rue);
            return 1;
        }

    }
}
