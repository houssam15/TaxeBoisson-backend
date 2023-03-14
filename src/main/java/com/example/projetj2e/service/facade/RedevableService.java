package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Redevable;

import java.util.List;

public interface RedevableService {

    Redevable findByCin(String cin);
    int deleteByCin(String cin);
    List<Redevable> findAll();
    int save(Redevable redevable);

    Redevable getOne(Long id);
}
