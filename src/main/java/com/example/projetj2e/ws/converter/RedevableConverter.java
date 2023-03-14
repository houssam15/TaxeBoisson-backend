package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.ws.dto.RedevableDto;
import org.springframework.stereotype.Component;

@Component
public class RedevableConverter extends AbstractConverter<Redevable,RedevableDto> {
    @Override
    public RedevableDto toDto(Redevable item){
        RedevableDto dto = null;
        if (item != null){
            dto= new RedevableDto();
            dto.setId(item.getId());
            dto.setCin(item.getCin());
            dto.setNom(item.getNom());
            dto.setPrenom(item.getPrenom());
        }
        return  dto;
    }
    @Override
    public Redevable toItem(RedevableDto dto){
        Redevable item = null;
        if (dto != null){
            item= new Redevable();
            item.setId(dto.getId());
            item.setCin(dto.getCin());
            item.setNom(dto.getNom());
            item.setPrenom(dto.getPrenom());
        }
        return  item;
    }

}
