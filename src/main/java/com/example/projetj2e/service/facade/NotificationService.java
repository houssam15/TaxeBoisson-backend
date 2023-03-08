package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.Notification;
import jakarta.transaction.Transactional;

public interface NotificationService {

    Notification findByRef(String ref) ;
    @Transactional
    int deleteByRef(String ref);
    int save(Notification entity);

}
