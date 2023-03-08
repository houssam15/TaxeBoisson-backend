package com.example.projetj2e.service.facade;

import com.example.projetj2e.bean.NotificationLocal;
import jakarta.transaction.Transactional;

public interface NotificationLocalService {
    NotificationLocal findByRef(String ref);

    @Transactional
    int deleteByReference(String ref);
    int save(NotificationLocal entity);

}
