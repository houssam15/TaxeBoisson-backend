package com.example.projetj2e.ws.dto;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.bean.NotificationLocal;
import com.example.projetj2e.bean.Redevable;
import jakarta.persistence.ManyToOne;

public class NotificationLocalDto extends NotificationLocal {
    private Long id;
    private String ref;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Notification notification;
    @ManyToOne
    private Local local;
    private double montantEsstime;

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public double getMontantEsstime() {
        return montantEsstime;
    }

    public void setMontantEsstime(double montantEsstime) {
        this.montantEsstime = montantEsstime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
