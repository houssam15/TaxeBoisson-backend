package com.example.projetj2e.service.impl;


import com.example.projetj2e.bean.Local;
import com.example.projetj2e.dao.LocalDao;
import com.example.projetj2e.service.facade.LocalService;
import com.example.projetj2e.ws.dto.LocalDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class LocalServiceImpl implements LocalService {
    @Autowired
    private LocalDao localDao;
    @Autowired
    private RedevableServiceImpl redevableService;
    @Autowired
    private CategorieDeLocalServiceImpl categorieDeLocalService;
    @Autowired
    private RueServiceImpl rueService;

    public List<Local> findByRedevableCin(String cin){
        return localDao.findByRedevableCin(cin);
    }
    @Transactional
   public int deleteByRedevableCin(String cin){
        return localDao.deleteByRedevableCin(cin);
    }

    @Override
    public int deleteByReference(String Reference) {
        return 0;
    }

    public Local findByReference(String reference){
        return localDao.findByReference(reference);
    }
    public List<Local> findAll() {
        return localDao.findAll();
    }
    public int save(Local local) {
    if(findByReference(local.getReference())!=null){
           return -1;
    }else if(local.getRedevable()==null){
           return -2;
    }else if(redevableService.findByCin(local.getRedevable().getCin())==null){
           return -3;
       } else if(categorieDeLocalService.findByCode(local.getCategorieDeLocal().getCode())==null){
           return -4;
    }else if(rueService.findByCode(local.getRue().getCode())==null){
           return -5;
    }
       else{
            local.setRedevable(redevableService.findByCin(local.getRedevable().getCin()));
            local.setCategorieDeLocal(categorieDeLocalService.findByCode(local.getCategorieDeLocal().getCode()));
            local.setRue(rueService.findByCode(local.getRue().getCode()));
            local.setDateAjoutDeLocal(new Date());
            local.setDernierDatePayTrimestriel(null);
            local.setDernierDatePayAnnuel(null);
            localDao.save(local);
           return 1;
       }
    }
    public Local update(Local local){
        return localDao.save(local);
    }

}
