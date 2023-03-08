package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.NotificationLocal;
import com.example.projetj2e.dao.NotificationLocalDao;
import com.example.projetj2e.service.facade.NotificationLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public int save(NotificationLocal entity) {
        return 0;
    }

    public List<NotificationLocal> findAll() {
        return notificationLocalDao.findAll();
    }

    @Autowired
    private RedevableServiceImpl redevableService;
    @Autowired
    private LocalServiceImpl localService;
    @Autowired
    private NotificationServiceImpl notificationService ;
}
