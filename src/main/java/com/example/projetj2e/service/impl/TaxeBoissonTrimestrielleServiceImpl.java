package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.TaxeBoissonTrimestrielle;
import com.example.projetj2e.dao.TaxeBoissonTrimestrielleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxeBoissonTrimestrielleServiceImpl {
    @Autowired
    private TaxeBoissonTrimestrielleDao taxeBoissonTrimestrielleDao;

    public TaxeBoissonTrimestrielle findByReference(String reference) {
        return taxeBoissonTrimestrielleDao.findByReference(reference);
    }

    public int deleteByReference(String reference) {
        return taxeBoissonTrimestrielleDao.deleteByReference(reference);
    }

    public List<TaxeBoissonTrimestrielle> findAll() {
        return taxeBoissonTrimestrielleDao.findAll();
    }

    public int save(TaxeBoissonTrimestrielle entity) {
        if(findByReference(entity.getReference())!=null){
            return -1;//deja exist
        }else if(redevableService.findByCin(entity.getRedevable().getCin())==null){
            return -2;//redevable n'exist pas
        }
        else if(localService.findByReference(entity.getLocal().getRef())==null){
            return -3;//local n'exist pas


        }else{
        if(entity.getLocal().getCategorieDeLocal().getCode()!=entity.getCategorieDeLocal().getCode()) {
            //si le categorie de local est change en doit fait le mise ajour de categorie
            Local local = localService.findByReference(entity.getLocal().getRef());
            local.setCategorieDeLocal(entity.getCategorieDeLocal());
            localService.update(local);
            //si le cetegorie change ==> taux change
            entity.setTauxTaxeTrimestrielle(tauxTaxeTrimestrielleService.findByCategorieDeLocalCode(entity.getCategorieDeLocal().getCode()));

        }else{
            //traitment

        }
        return 1;

        }

    }
    @Autowired
    private RedevableServiceImpl redevableService;
    @Autowired
    private LocalServiceImpl localService;
    @Autowired
    private TauxTaxeTrimestrielleServiceImpl tauxTaxeTrimestrielleService;
}
