package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.NotificationLocal;
import com.example.projetj2e.service.facade.NotificationLocalService;
import com.example.projetj2e.ws.converter.NotificationLocalConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("api/v1/NotificationLocalRest")
public class NotificationLocalRest {
    @Autowired
    private NotificationLocalService notificationLocalService ;
    @Autowired
    private NotificationLocalConverter notificationLocalConverter;


    public NotificationLocal findByRef(String ref) {
        return notificationLocalService.findByRef(ref);
    }

    @Transactional
    public int deleteByReference(String ref) {
        return notificationLocalService.deleteByReference(ref);
    }

    public int save(NotificationLocal entity) {
        return notificationLocalService.save(entity);
    }
}
