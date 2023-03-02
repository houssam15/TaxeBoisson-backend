package com.example.projetj2e.service.impl;


import com.example.projetj2e.bean.Local;
import com.example.projetj2e.dao.LocalDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class LocalService {
    @Autowired
    private LocalDao localDao;

    private RedevableService redevableService;

    public List<Local> findByRedevableCin(String cin){
        return localDao.findByRedevableCin(cin);
    }
    @Transactional
   public int deleteByRedevableCin(String cin){
        return localDao.deleteByRedevableCin(cin);
    }
    public Local findByReference(String reference){
        return localDao.findByReference(reference);
    }



    public int save(Local local){
       if(redevableService.findByCin(local.getRedevable().getCin())==null){
           return -1;
       }
       else if(findByReference(local.getRef())!= null){
           return -2;
       }
     else{
           localDao.save(local);
           return 1;
       }
    }

}
