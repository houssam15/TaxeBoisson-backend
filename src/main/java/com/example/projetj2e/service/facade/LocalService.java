package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Redevable;

import java.util.List;

public interface LocalService {
    Local findByReference(String reference);
    List<Local> findByRedevableCin(String cin);
   int deleteByRedevableCin(String cin);
   int deleteByReference(String Reference);
    int save(Local local);

}
