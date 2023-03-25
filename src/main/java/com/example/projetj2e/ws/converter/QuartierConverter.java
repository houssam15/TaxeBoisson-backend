package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Quartier;
import com.example.projetj2e.dao.QuartierDao;
import com.example.projetj2e.ws.dto.QuartierDto;
import org.springframework.stereotype.Component;

@Component
public class QuartierConverter extends AbstractConverter<Quartier, QuartierDto> {


    @Override
    public QuartierDto toDto(Quartier item) {
        QuartierDto quartierDto = null;
        if(item!=null){
            quartierDto = new QuartierDto();
            quartierDto.setId(item.getId());
            quartierDto.setCode(item.getCode());
            quartierDto.setLibelle(item.getLibelle());
            quartierDto.setSecteur(item.getSecteur());
        }
        return quartierDto;
    }

    @Override
    public Quartier toItem(QuartierDto dto) {
        Quartier quartier=null;
        if(dto!=null){
            quartier = new Quartier();
            quartier.setId(dto.getId());
            quartier.setCode(dto.getCode());
            quartier.setLibelle(dto.getLibelle());
            quartier.setSecteur(dto.getSecteur());
        }
        return quartier;
    }
}
