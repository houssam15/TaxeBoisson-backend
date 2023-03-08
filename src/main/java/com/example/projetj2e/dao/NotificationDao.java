package com.example.projetj2e.dao;

import com.example.projetj2e.bean.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDao extends JpaRepository<Notification,Long> {
    Notification findByRef(String ref);
    int deleteByRef(String ref);
}
