package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.TauxTaxeAnnuel;
import com.example.projetj2e.dao.TauxTaxeAnnuelDao;
import com.example.projetj2e.service.facade.TauxTaxeAnnuelService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TauxTaxeAnnuelServiceImpl implements TauxTaxeAnnuelService {
    @Override
    public TauxTaxeAnnuel findByReference(String reference) {
        return tauxTaxeAnnuelDao.findByReference(reference);
    }

    @Override
    public List<TauxTaxeAnnuel> findAll() {
        return tauxTaxeAnnuelDao.findAll();
    }

    @Override
    public TauxTaxeAnnuel findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(String code, Date date) {
        return tauxTaxeAnnuelDao.findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(code, date,date);
    }

    @Override
    @Transactional
    public int deleteByReference(String reference) {
        return tauxTaxeAnnuelDao.deleteByReference(reference);
    }

    @Override
    public int save(TauxTaxeAnnuel tauxTaxeAnnuel) {
        if (findByReference(tauxTaxeAnnuel.getReference())!=null){
            return -1;
        }else if(categorieDeLocalService.findByCode(tauxTaxeAnnuel.getCategorieDeLocal().getCode())==null){
            return -2;
        }else if(tauxTaxeAnnuel.getPourcentagePremierMoisRetard()<0 || tauxTaxeAnnuel.getPourcentageAutreMoisRetard()<0){
            return -3;
        }else{
            tauxTaxeAnnuelDao.save(tauxTaxeAnnuel);
            return 1;
        }
    }

    @Autowired
    TauxTaxeAnnuelDao tauxTaxeAnnuelDao;
    @Autowired
    CategorieDeLocalServiceImpl categorieDeLocalService;
}