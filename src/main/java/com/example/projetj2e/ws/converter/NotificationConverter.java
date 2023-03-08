package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Notification;
import com.example.projetj2e.ws.dto.NotificationDto;
import org.springframework.stereotype.Component;

@Component
public class NotificationConverter extends AbstractConverter<Notification , NotificationDto> {
    @Override
    public NotificationDto toDto(Notification item) {
        NotificationDto dto= null;
        if (item != null) {
            dto = new NotificationDto();
            dto.setId(item.getId());
            dto.setRef(item.getRef());
            dto.setDateNotification(item.getDateNotification());
            dto.setAnnée(item.getAnnée());
            dto.setTrimestre(item.getTrimestre());
        }
        return dto;
    }

    @Override
    public Notification toItem(NotificationDto dto) {
        Notification item= null;
        if (dto != null) {
            item = new Notification();
            item.setId(dto.getId());
            item.setRef(dto.getRef());
            item.setDateNotification(dto.getDateNotification());
            item.setAnnée(dto.getAnnée());
            item.setTrimestre(dto.getTrimestre());
        }
        return item;
    }


}
