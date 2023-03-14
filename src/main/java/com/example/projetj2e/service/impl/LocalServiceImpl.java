package com.example.projetj2e.service.impl;


import com.example.projetj2e.bean.Local;
import com.example.projetj2e.dao.LocalDao;
import com.example.projetj2e.service.facade.LocalService;
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



    public int save(Local local) {
    if(findByReference(local.getReference())!=null){
           return -1;
    }else if(redevableService.findByCin(local.getRedevable().getCin())==null){
           return -2;
       }
       else if(findByReference(local.getReference())!= null){
           return -3;
       }
     else{
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
