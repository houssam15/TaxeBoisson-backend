package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Rue;
import com.example.projetj2e.ws.dto.RueDto;
import org.springframework.stereotype.Component;

@Component
public class RueConverter extends AbstractConverter<Rue, RueDto> {
    @Override
    public RueDto toDto(Rue item) {
        RueDto rueDto = null;
        if(item!=null){
            rueDto=new RueDto();
            rueDto.setCode(item.getCode());
            rueDto.setId(item.getId());
            rueDto.setLibelle(item.getLibelle());
            rueDto.setQuartier(item.getQuartier());

        }
        return rueDto;
    }

    @Override
    public Rue toItem(RueDto dto) {
        Rue rue =null;
        if(dto!=null){
            rue = new Rue();
            rue.setCode(dto.getCode());
            rue.setLibelle(dto.getLibelle());
            rue.setId(dto.getId());
            rue.setQuartier(dto.getQuartier());
        }
        return rue;
    }
}
