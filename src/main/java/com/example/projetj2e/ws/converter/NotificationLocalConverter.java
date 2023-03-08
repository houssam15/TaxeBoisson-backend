package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.bean.NotificationLocal;
import com.example.projetj2e.ws.dto.NotificationDto;
import com.example.projetj2e.ws.dto.NotificationLocalDto;
import org.springframework.stereotype.Component;

@Component
public class NotificationLocalConverter extends AbstractConverter<NotificationLocal , NotificationLocalDto> {
    @Override
    public NotificationLocalDto toDto(NotificationLocal item) {
        NotificationLocalDto dto= null;
        if (item != null) {
            dto = new NotificationLocalDto();
            dto.setId(item.getId());
            dto.setRef(item.getRef());
            dto.setNotification(item.getNotification());
            dto.setLocal(item.getLocal());
            dto.setRedevable(item.getRedevable());
            dto.setMontantEsstime(item.getMontantEsstime());
        }
        return dto;
    }

    @Override
    public NotificationLocal toItem(NotificationLocalDto dto) {
        NotificationLocal item= null;
        if (dto != null) {
            item = new NotificationLocal();
            item.setId(dto.getId());
            item.setRef(dto.getRef());
            item.setNotification(item.getNotification());
            item.setLocal(item.getLocal());
            item.setRedevable(item.getRedevable());
            item.setMontantEsstime(item.getMontantEsstime());
        }
        return item;
    }
}
