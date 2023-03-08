package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.service.facade.NotificationService;
import com.example.projetj2e.ws.converter.NotificationConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("api/v1/NotificationRest")
public class NotificationRest {
    @Autowired
    private NotificationService notificationService ;
    @Autowired
    private NotificationConverter notificationConverter;

    public Notification findByRef(String ref) {
        return notificationService.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return notificationService.deleteByRef(ref);
    }

    public int save(Notification entity) {
        return notificationService.save(entity);
    }
}
