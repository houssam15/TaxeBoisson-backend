package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.bean.NotificationLocal;
import com.example.projetj2e.dao.NotificationLocalDao;
import com.example.projetj2e.service.facade.NotificationLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotificationLocalServiceImpl implements NotificationLocalService {
    @Autowired
    private NotificationLocalDao notificationLocalDao;


    @Override
    public NotificationLocal findByRef(String ref) {
        return null;
    }

    @Override
    public int deleteByReference(String ref) {
        return 0;
    }



    public List<NotificationLocal> findAll() {
        return notificationLocalDao.findAll();
    }
    @Override
    public int save(NotificationLocal entity) {

        if(findByRef(entity.getRef())!=null){
            return -1;//notification deja exist
        }else if(redevableService.findByCin(entity.getRedevable().getCin())==null){
            return -2;//redevable n'exist pas
        }else if(localService.findByReference(entity.getLocal().getReference())==null){
            return -3;//local n'exist pas
        }else {
            Local local = localService.findByReference(entity.getLocal().getReference());
            Date dernierPayAnnuel = local.getDernierDatePayAnnuel();
            Date dernierPayTri = local.getDernierDatePayTrimestriel();
            //année de notification
            int annéeNotification = dernierPayAnnuel.getYear();
            //dernier trimestre
            int mois = dernierPayTri.getMonth();
            int trimestreNotification = 0;
            if(mois>=1 && mois <=3){
                trimestreNotification=1;
            }else if(mois>=4 && mois <=6){
                trimestreNotification=2;

            }else if(mois>=7 && mois <=9){
                trimestreNotification=3;
            }else if(mois>=10 && mois <=12){
                trimestreNotification=4;
            }
            //enregistrement de trimestre et anne notification
            Notification notification =entity.getNotification() ;
            notification.setDateNotification(new Date());
            notification.setTrimestre(trimestreNotification);
            notification.setAnnée(annéeNotification);
            entity.setNotification(notification);

            //calcul montant estime
            double montantestimme=0;
            /*
            .
            .
            .
             */
            entity.setMontantEsstime(montantestimme);
            //save notification local
            notificationService.save(entity.getNotification());
            notificationLocalDao.save(entity);
            return 1;
        }
    }

    @Autowired
    private RedevableServiceImpl redevableService;
    @Autowired
    private LocalServiceImpl localService;
    @Autowired
    private NotificationServiceImpl notificationService ;

}
