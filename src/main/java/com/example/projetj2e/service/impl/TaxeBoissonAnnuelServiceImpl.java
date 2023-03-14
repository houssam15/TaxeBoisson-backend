package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.TaxeBoissonAnnuel;
import com.example.projetj2e.dao.TaxeBoissonAnnuelDao;
import com.example.projetj2e.service.facade.TaxeBoissonAnnuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class TaxeBoissonAnnuelServiceImpl implements TaxeBoissonAnnuelService {
    @Override
    public TaxeBoissonAnnuel findByReference(String reference) {
        return taxeBoisssonAnnuelDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return taxeBoisssonAnnuelDao.deleteByReference(reference);
    }

    @Override
    public List<TaxeBoissonAnnuel> findAll() {
        return taxeBoisssonAnnuelDao.findAll();
    }

    @Override
    public int save(TaxeBoissonAnnuel entity) {
        if (findByReference(entity.getReference()) != null) {
            return -1; // déjà existant
        } else if (redevableService.findByCin(entity.getRedevable().getCin()) == null) {
            return -2; // redevable inexistant
        } else if (localService.findByReference(entity.getLocal().getReference()) == null) {
            return -3; // local inexistant
        } else if (entity.getLocal().getDernierDatePayTrimestriel() == null) {
            return -4; // dernier date de payement trimestriel inexistante
        }else if(entity.getChifrreAffaireAnnuel()<=0) {
            return -5;//chiffre d'affairre null ou negative
        } else {
            if(entity.getLocal().getCategorieDeLocal().getCode()!=entity.getCategorieLocal().getCode()) {
                //si le categorie de local est change en doit fait le mise ajour de categorie
                Local local = localService.findByReference(entity.getLocal().getReference());
                local.setCategorieDeLocal(entity.getCategorieLocal());
                localService.update(local);
            }
            Date dernierPayementTri = entity.getLocal().getDernierDatePayTrimestriel();
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(dernierPayementTri);
            cal1.add(Calendar.MONTH, 3);
            Date dateMinRetard = cal1.getTime();
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(dateMinRetard);
            cal2.add(Calendar.MONTH, 3);
            Date dateMaxRetard = cal2.getTime();
            Date dateActuelle = new Date();
            long diffInMillies1 = dateActuelle.getTime() - dateMaxRetard.getTime();
            long diffInDays1 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
            if (diffInDays1 < 0) {
                return -6; // déclaration de taxe annuelle avant 3 mois après la fin de l'année fiscale
            } else {
                double montantRetardPremierMois = 0;
                double montantRetardAutreMois = 0;
                double diffInMonths = TimeUnit.MILLISECONDS.toDays(diffInMillies1) / 30.44;
                int moisRetard = (int) diffInMonths;
                if (moisRetard > 0) {
                    montantRetardPremierMois = entity.getTauxTaxeAnnuel().getPourcentagePremierMoisRetard() / 100 * entity.getChifrreAffaireAnnuel();
                    montantRetardAutreMois = entity.getTauxTaxeAnnuel().getPourcentageAutreMoisRetard() / 100 * entity.getChifrreAffaireAnnuel() * (moisRetard - 1);
                }
                entity.setMontantTotal(montantRetardPremierMois + montantRetardAutreMois);
                taxeBoisssonAnnuelDao.save(entity);
                return 1;
            }
        }
    }

    @Autowired
    TaxeBoissonAnnuelDao taxeBoisssonAnnuelDao;
    @Autowired
    RedevableServiceImpl redevableService;
    @Autowired
    LocalServiceImpl localService;
    @Autowired
    TauxTaxeAnnuelServiceImpl tauxTaxeAnnuelService;
}