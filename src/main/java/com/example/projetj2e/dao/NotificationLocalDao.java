package com.example.projetj2e.dao;

import com.example.projetj2e.bean.NotificationLocal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationLocalDao extends JpaRepository<NotificationLocal,Long> {
    NotificationLocal findByRef(String ref);
    int deleteByRef(String ref);

}
