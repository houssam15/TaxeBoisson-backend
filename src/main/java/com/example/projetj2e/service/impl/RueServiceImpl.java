package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Quartier;
import com.example.projetj2e.bean.Rue;
import com.example.projetj2e.dao.RueDao;
import com.example.projetj2e.service.facade.QuartierService;
import com.example.projetj2e.service.impl.LocalServiceImpl;
import com.example.projetj2e.service.impl.QuartierServiceImpl;
import com.example.projetj2e.service.facade.RueService;
import com.example.projetj2e.service.facade.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RueServiceImpl implements RueService {
    @Autowired
    private RueDao rueDao;
    @Autowired
    private QuartierService quartierService;
    // private Local local;

    @Override
    public Rue findByCode(String code) {
        return rueDao.findByCode(code);
    }

    @Override
   public int deleteByQuartierCode(String code){return rueDao.deleteByQuartierCode(code);}

    @Override
    public int save(Rue rue) {
        if (findByCode(rue.getCode())!=null){
            return  -1;
        }else if(rue.getQuartier()==null){
            return -2;
        }
        else if(quartierService.findByCode(rue.getQuartier().getCode())==null){
            return -3 ;
        }

       else{
            Quartier quartier = quartierService.findByCode(rue.getQuartier().getCode());
            rue.setQuartier(quartier);
            rueDao.save(rue);
            return 1;
        }

    }

    @Override
    public List<Rue> findAll() {
        return rueDao.findAll();
    }
}
