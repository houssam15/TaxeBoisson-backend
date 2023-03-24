package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.CategorieRedevable;
import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.dao.RedevableDao;
import com.example.projetj2e.service.facade.CategorieRedevableService;
import com.example.projetj2e.service.facade.RedevableService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RedevableServiceImpl implements RedevableService {
    @Autowired
    private RedevableDao redevableDao;

    @Autowired
    private LocalServiceImpl localService;
    @Autowired
    private CategorieRedevableServiceImpl categorieRedevableService;


    public Redevable findByCin(String cin) {
              return  redevableDao.findByCin(cin);
    }
    @Transactional
    public  int deleteByCin(String cin){
        int resultLocal=localService.deleteByRedevableCin(cin);
         int resultatRedevable=redevableDao.deleteByCin(cin);
         return resultatRedevable+resultLocal;

    }

    @Override
    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }

    public int save(Redevable redevable) {
        CategorieRedevable categorieRedevable = redevable.getCategorieRedevable();

        System.out.println(redevable.getCategorieRedevable().getCode());
        if (findByCin(redevable.getCin()) != null) {
            return -1;
        }else if(redevable.getCategorieRedevable()==null){
            return -2;
        }else if(categorieRedevableService.findByCode(redevable.getCategorieRedevable().getCode())==null){
            return -3;
        }
        else {
            redevable.setCategorieRedevable(categorieRedevableService.findByCode(redevable.getCategorieRedevable().getCode()));
            redevableDao.save(redevable);
            return 1;
        }

    }

    @Override
    public Redevable getOne(Long id) {
        return null;
    }
}
