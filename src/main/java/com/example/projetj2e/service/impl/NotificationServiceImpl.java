package com.example.projetj2e.service.impl;

import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.dao.NotificationDao;
import com.example.projetj2e.service.facade.NotificationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationDao notificationDao;

    public Notification findByRef(String ref) {
        return notificationDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return notificationDao.deleteByRef(ref);
    }

    @Override
    public int save(Notification entity) {
        return 0;
    }

    public List<Notification> findAll() {
        return notificationDao.findAll();
    }
}
